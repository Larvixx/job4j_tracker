package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Andrey Weselov");
        student.setGroup("4A");
        student.setDate("01.09.2023");
        System.out.println("Студент : " + student.getName()
                + System.lineSeparator()
                + "Группа : " + student.getGroup()
                + System.lineSeparator()
                + "Дата поступления : " + student.getDate());
    }
}
