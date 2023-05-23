package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Едет по железной дороге ! ");
    }

    @Override
    public void speed() {
        System.out.println(" 100 km/h");
    }
}
1