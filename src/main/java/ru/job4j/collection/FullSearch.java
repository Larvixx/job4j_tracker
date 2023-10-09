package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task lists : list) {
            numbers.add(lists.getNumber());
        }
        return numbers;
    }

}
