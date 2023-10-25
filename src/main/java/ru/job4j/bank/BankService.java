package ru.job4j.bank;
1
import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.*;

import static javax.swing.UIManager.put;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void deleteUser(String passport) {
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                users.remove(key);
            }
        }
    }

    public void addAccount(String passport, Account account) {
        List accounts = users.get(findByPassport(passport));
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

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

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite,
                                 double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || destAccount == null
                || srcAccount.getBalance() < amount) {
            return rsl;
        }
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);
        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}