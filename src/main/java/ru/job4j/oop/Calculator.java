package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int y) {
        return y * x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y)
                + divide(y);
    }

    public static void main(String[] args) {
        System.out.println(minus(10));
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(8));
        System.out.println(calculator.multiply(15));
        System.out.println(sum(25));
        System.out.println(calculator.sumAllOperation(3));

    }
}