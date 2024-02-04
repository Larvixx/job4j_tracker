package ru.job4j.tracker;
1
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.*;

class ItemByNameTest {

    @Test
    public void thenAscByName() {
        List<Item> items = Arrays.asList(
                new Item("Bear"),
                new Item("Cat"),
                new Item("Apple"),
                new Item("Duck"));
        items.sort(new ItemAscByName());

        List<Item> expected = Arrays.asList(
                new Item("Apple"),
                new Item("Bear"),
                new Item("Cat"),
                new Item("Duck"));
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void thenDescByName() {
        List<Item> items = Arrays.asList(
                new Item("Bear"),
                new Item("Cat"),
                new Item("Apple"),
                new Item("Duck"));
        items.sort(new ItemDescByName());

        List<Item> expected = Arrays.asList(
                new Item("Duck"),
                new Item("Cat"),
                new Item("Bear"),
                new Item("Apple"));
        assertThat(items).isEqualTo(expected);
    }
}