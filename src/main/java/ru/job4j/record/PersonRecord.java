package ru.job4j.record;

public record PersonRecord(String name, int age, String city) {
    public static  int maxAge = 100;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

}
