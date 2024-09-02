package com.generics;

import java.util.ArrayList;
import java.util.List;

// Implementation of the generic interface
public class Box<T> implements Storage<T> {
    private List<T> items;

    public Box() {
        items = new ArrayList<>();
    }

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public static void main(String[] args) {
        // Example usage with Integer
        Storage<Integer> intBox = new Box<>();
        intBox.add(10);
        intBox.add(20);
        System.out.println("Integer at index 0: " + intBox.get(0));
        System.out.println("Integer at index 1: " + intBox.get(1));

        // Example usage with String
        Storage<String> stringBox = new Box<>();
        stringBox.add("Hello");
        stringBox.add("World");
        System.out.println("String at index 0: " + stringBox.get(0));
        System.out.println("String at index 1: " + stringBox.get(1));
    }
}
