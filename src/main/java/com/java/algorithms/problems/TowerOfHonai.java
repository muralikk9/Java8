package com.java.algorithms.problems;

public class TowerOfHonai {


    public static void main(String[] args) {
        towerOfHonai(4, 'A', 'C', 'B');
    }

    private static void towerOfHonai(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Moved disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        towerOfHonai(n-1, fromRod, auxRod, toRod);
        System.out.println("Moved disk " + n + " from rod " + fromRod + " to rod " + toRod);
        towerOfHonai(n-1, auxRod, toRod, fromRod);
    }
}
