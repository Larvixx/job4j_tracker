package ru.job4j.upCasting;

public class Animal {
    String nameClass = getClass().getSimpleName();

    public void sound() {
        System.out.println(nameClass + " - издает какой-то звук.");
    }
}