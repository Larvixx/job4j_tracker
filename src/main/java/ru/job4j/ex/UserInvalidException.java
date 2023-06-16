package ru.job4j.ex;
1
public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String message) {
        super(message);
    }
}
