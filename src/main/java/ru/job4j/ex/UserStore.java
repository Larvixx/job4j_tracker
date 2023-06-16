package ru.job4j.ex;
1
public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = new User(null, false);
        for (int i = 0; i < users.length; i++) {
            if (!login.equals(users[i].getUsername())) {
                throw new UserNotFoundException("Пользователь не найден !");
            } else {
                rsl = users[i];
            }
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользователь не валидный !");
        }
        return true;
    }

    public static void main(String[] args) throws UserInvalidException {
        User[] users = {
                new User("Petr Arsentev", false)
        };
        try {
            User user = findUser(users, "Petr Arsentev");

            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            System.out.println(ei.getMessage());
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}