package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            } else {
                throw new ElementNotFoundException();
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = new String[]{"One", "Two"};
        String key = "Three";
        try {
            indexOf(value, key);
        } catch (ElementNotFoundException e) {
            System.out.println("Элемент в массиве не найден !");
            ;
        }
    }
}