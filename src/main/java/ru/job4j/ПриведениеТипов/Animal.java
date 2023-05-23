package ru.job4j.ПриведениеТипов;

public class Animal {
    String nameClass = getClass().getSimpleName();

    public void sound() {
        System.out.println(nameClass + " - издает какой-то звук.");
    }
}