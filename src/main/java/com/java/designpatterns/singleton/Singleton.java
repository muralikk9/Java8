package com.java.designpatterns.singleton;

public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        }
        return instance;
    }

    private Singleton() {
    }

    public String test() {
        return "singleton test method called";
    }
}
