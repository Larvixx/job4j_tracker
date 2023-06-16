package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (!login.equals(user.getUsername())) {
                throw new UserNotFoundException("Пользователь не найден !");
            }
        }
        return new User(login, true);
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользователь не валидный !");
        }
        return true;
    }

    public static void main(String[] args) throws UserInvalidException {
        User[] users = {
                new User("Petr Arsentev", true)
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
}1