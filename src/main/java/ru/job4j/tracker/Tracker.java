package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final ArrayList<Item> items = new ArrayList<>();
    private int size = 0;
    private int ids = 0;

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        ArrayList<Item> toRemove = new ArrayList<>();
        for (Item item : items) {
            if (items.indexOf(item) == id) {
                toRemove.add(item);
                rsl = true;
            }
        }
        items.removeAll(toRemove);
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        for (Item item1 : items) {
            if (item1.getId() == id) {
                items.set(id, item);
                rsl = true;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }


    public List<Item> findByName(String key) {
        ArrayList<Item> rsl = new ArrayList<>();
        for (Item item : items) {
            if (key.equals(item.getName())) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}