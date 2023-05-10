package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tracker tracker = (Tracker) o;
        return ids == tracker.ids && size == tracker.size && Arrays.equals(items, tracker.items);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(ids, size);
        result = 31 * result + Arrays.hashCode(items);
        return result;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[items.length];
        int x = 0;
        for (int index = 0; index < size; index++) {
            Item name = items[index];
            if (name != null) {
                rsl[x] = name;
                x++;
            }
        }
        rsl = Arrays.copyOf(rsl, x);
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        int x = 0;
        for (int index = 0; index < items.length; index++) {
            Item name = items[index];
            if (name != null && key.equals(name.getName())) {
                rsl[x] = items[index];
                x++;
            }
        }
        rsl = Arrays.copyOf(rsl, x);
        return rsl;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}