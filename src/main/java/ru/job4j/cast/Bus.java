package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Перевозит пассажиров по городу ");
    }

    @Override
    public void speed() {
        System.out.println(" 60 km/h");
    }
}
1