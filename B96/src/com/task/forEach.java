package com.task;

import java.util.ArrayList;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
            // Cannot remove elements during iteration using for-each loop
            // This will throw ConcurrentModificationException
            fruits.remove(0);
        }
    }
}

