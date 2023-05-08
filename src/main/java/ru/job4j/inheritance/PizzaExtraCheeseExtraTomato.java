package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String EXTRA_CHEESE_EXTRA_TOMATO = " + extra tomato";

    @Override
    public String name() {
        return super.name() + EXTRA_CHEESE_EXTRA_TOMATO;
    }
}
