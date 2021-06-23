package com.java.datastructures;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Objects;

@Slf4j
public class DynamicArray<E> {
    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    public E get(int index) {
        return (E) data[index];
    }

    public void set(int index, E value) {
        data[index] = value;
    }

    public void insert(E value) {
        if (initialCapacity == size) {
            resize();
        }
        data[size] = value;
        size++;
    }

    public void resize() {
        this.initialCapacity = this.initialCapacity * 2;
        data = Arrays.copyOf(data, this.initialCapacity);
    }

    public void delete(int index) {
        if (index < data.length) {
            size--;
        }
        data = Arrays.stream(data)
                .filter(i -> i != data[index])
                .toArray();
        size--;
    }

    public boolean contains(E value) {
        return Arrays.stream(data)
                .filter(Objects::nonNull)
                .anyMatch(i -> i == value);
    }

    public void print() {
        Arrays.stream(data)
                .filter(Objects::nonNull)
                .forEach(i -> log.info("{}", i));
    }
}
