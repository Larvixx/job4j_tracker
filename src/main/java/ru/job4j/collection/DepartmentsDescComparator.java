package ru.job4j.collection;
1
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        if (left.split("/", 2)[0].equals(right.split("/", 2)[0])) {
            return left.compareTo(right);
        }
        return right.compareTo(left);
    }
}