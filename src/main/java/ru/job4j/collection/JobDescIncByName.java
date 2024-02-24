package ru.job4j.collection;

import java.util.Comparator;

public class JobDescIncByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
