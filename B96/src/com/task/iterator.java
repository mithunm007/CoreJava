package com.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);

            // Remove "Banana" from the list
            if ("Banana".equals(fruit)) {
                iterator.remove();
            }
        }

        System.out.println("After removal: " + fruits);
    }
}
