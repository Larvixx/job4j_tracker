package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Летает по воздуху ! ");

    }

    @Override
    public void speed() {
        System.out.println(" 1000 km/h");

    }
}
1