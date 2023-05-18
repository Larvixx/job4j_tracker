package ru.job4j.record;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Иван", 30);
        System.out.println("Имя: " + person.getName() + ", Возраст: " + person.getAge());
        System.out.println(person);
        PersonRecord record = new PersonRecord("Иван", 30, "Spb");
        System.out.println("Имя: " + record.name() + ", Возраст: " + record.age());
        System.out.println(record);
        PersonRecord newRecord = new PersonRecord(record.name(), 35, "MSK");
        System.out.println(newRecord);
        PersonRecord record1 = new PersonRecord("Иван", 30, "Voronezh");
        System.out.println(record.equals(record1));
        System.out.println(record1);
    }
}