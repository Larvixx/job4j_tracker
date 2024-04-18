package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = right.split("/", 2)[0].compareTo(left.split("/", 2)[0]);
        return result != 0 ? result : left.compareTo(right);
    }
}