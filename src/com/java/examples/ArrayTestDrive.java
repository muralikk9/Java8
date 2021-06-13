package com.java.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayTestDrive {
    private int[] array = new int[20];
    private int arraySize = 10;

    public void generateRandomArray(){
        IntStream.range(0, arraySize).forEach( i -> {
            array[i] = (int) (Math.random() * 10) + 10;
        });
    }

    public void printArray() {
        System.out.println("----------");
        IntStream.range(0, arraySize).forEach( i -> {
            System.out.print("| " + i  + " ");
            System.out.println("| " + array[i] + " |");
            System.out.println("----------");
        });

    }

    public static void main(String[] args){
        ArrayTestDrive arrayTestDrive = new ArrayTestDrive();
        arrayTestDrive.generateRandomArray();
        arrayTestDrive.printArray();
        //System.out.println("get value at index 3 " + arrayTestDrive.getValueAtIndex(3));
        //System.out.println("is 19 present " + arrayTestDrive.arrayContainsValue(19));
        //arrayTestDrive.deleteElementAtIndex(4);
        //arrayTestDrive.printArray();
        //arrayTestDrive.addElement(55);
        //arrayTestDrive.printArray();
        //arrayTestDrive.linearSearch(19);
        arrayTestDrive.bubbleSort();
        System.out.println("----- after sorting ------");
        arrayTestDrive.printArray();
       arrayTestDrive.binarySearch(12);
    }


    private void binarySearch(int value) {
        int lowIndex = 0;
        int highIndex = arraySize -1 ;
        while(lowIndex <=highIndex) {
            int midIndex = (lowIndex+highIndex)/2;
            if(array[midIndex] > value) {
                highIndex = midIndex -1 ;
            }  if(array[midIndex] < value) {
                lowIndex = midIndex + 1 ;
            } else {
                System.out.println("found element at index " + midIndex);
                lowIndex = highIndex + 1;
            }
        }
    }

    private void bubbleSort() {
        for (int i = arraySize -1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    swapValues(j , j+1);
                }
            }
            System.out.println("after sorting result :"  + array[i]);
        }
    }

    private void swapValues(int indexOne, int indexTwo) {
        int temp = array[indexTwo];
        array[indexTwo] = array[indexOne];
        array[indexOne] = temp;

    }

    private void linearSearch(int searchElement) {
        IntPredicate predicate = i -> array[i] == searchElement;
        List<Integer> list = IntStream.range(0, arraySize).filter(predicate).boxed().collect(Collectors.toList());
        System.out.println("searched element " + searchElement + " found at index " + list);
    }

    private void addElement(int value) {
        if(arraySize < array.length) {
            array[arraySize] = value;
            arraySize++;
        }

    }

    private void deleteElementAtIndex(int index) {
        if(index < arraySize) {
            for (int i = index; i < (arraySize -1); i++) {
                array[i] = array[i+1];
            }
            arraySize--;
        } else {
            System.out.println("elements at given index is empty");
        }
    }

    public boolean arrayContainsValue(int value) {
        return Arrays.stream(array).anyMatch(i -> i == value);
    }

    public int getValueAtIndex(int index) {
        if(index < arraySize) {
            return array[index];
        }
        return 0;
    }
}
