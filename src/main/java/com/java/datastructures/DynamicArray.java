package com.java.datastructures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DynamicArray<E> {
    private static final Logger logger = LoggerFactory.getLogger(DynamicArray.class);
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
        int newCapacity = initialCapacity * 2;
        Object[] newData = new Object[newCapacity];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = newCapacity;
    }

    public void delete(int index) {
        for (int i = index; i < data.length; i++) {
            if(i < data.length-1)
                data[i] = data[i+1];
        }
        size--;
    }

    public boolean contains(E value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && data[i] == value)
                return true;
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null)
                logger.info("{}", data[i]);
        }
    }
}
