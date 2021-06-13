package com.java.datastructures;


import java.util.stream.IntStream;

public class DynamicArrayTestDrive {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        IntStream.range(1, 6).forEach(array::insert);
        //System.out.println("array contains " + array.contains(10));
        array.print();
        array.delete(1);
        array.print();
    }
}
