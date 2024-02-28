package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 0; left.length() >= right.length() ? i < left.length() - 1 : i < right.length() - 1; i++) {
            char leftChar = left.charAt(i);
            char rightChar = right.charAt(i);
            if (leftChar != rightChar || left.length() != right.length()) {
                return leftChar > rightChar ? 1 : -1;
            }
        }
        return 0;
    }
}