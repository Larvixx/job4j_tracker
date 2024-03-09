package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.*;

import static javax.swing.UIManager.put;

public class BankService {
    /**
     * Поле содержит всех пользователей с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя с пустым списком счетов
     *
     * @param user
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод удаляет пользователя из системы по номеру паспорта
     *
     * @param passport
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод добавляет новый счёт пользователю
     * проверяя, что такого счета ещё нет
     *
     * @param passport
     * @param account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List accounts = users.get(user);
        if (!accounts.contains(account) && user != null) {
            accounts.add(account);
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     *
     * @param passport
     * @return user or null
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет пользователя по паспорту и реквизитам
     *
     * @param passport
     * @param requisite
     * @return account or null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит средства с одного счёта на другой
     * использую паспортные данные и реквизиты
     * проверяя наличие данного счёта и достаточный баланс
     * для проведения операции
     *
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param destRequisite
     * @param amount
     * @return true or false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || destAccount == null || srcAccount.getBalance() < amount) {
            return false;
        }
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);
        return true;
    }

    /**
     * Метод необходимый для тестов
     *
     * @param user
     * @return
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}