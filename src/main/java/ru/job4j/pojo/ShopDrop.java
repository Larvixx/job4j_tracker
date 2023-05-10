package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = 0; i < products.length - 1; i++) {
            if (products[i] == null) {
                for (int j = i; j < products.length - 1; j++) {
                    if (products[j + 1] != null) {
                        products[i] = products[j + 1];
                        products[j + 1] = null;
                        break;
                    }
                }
            }
        }
        return products;
    }
}