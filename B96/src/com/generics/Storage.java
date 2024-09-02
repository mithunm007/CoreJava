package com.generics;

//Generic interface
public interface Storage<T> {
 void add(T item);
 T get(int index);
}
