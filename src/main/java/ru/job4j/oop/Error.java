package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность " + active);
        System.out.println("Статус " + status);
        System.out.println("Сообщение " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error mistake = new Error(true, 100, "Гав");
        Error bug = new Error(false, 124, "Мяу");
        error.printInfo();
        mistake.printInfo();
        bug.printInfo();

    }
}
