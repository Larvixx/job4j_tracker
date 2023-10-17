package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> account = new HashMap<>();
        account.put("weselov@list.ru", "Weselov Andrey Igorevich");
        for (String key : account.keySet()) {
            String value = account.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
