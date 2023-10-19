package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> account = new HashMap<>();
        account.put("weselov@list.ru", "Weselov Andrey Igorevich");
        account.put("weselov@list.ru", "Weselov  Denis Nikolaevich");
        account.put("ivanov@list.ru", "Ivanov  Ivan Ivanovich");
        for (String key : account.keySet()) {
            String value = account.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
