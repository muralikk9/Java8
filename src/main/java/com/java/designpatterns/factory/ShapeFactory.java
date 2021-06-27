package com.java.designpatterns.factory;

public class ShapeFactory {

    private ShapeFactory() {

    }

    public static Shape buildShape(String input) {
        if ("circle".equals(input)) {
            return () -> "Circle";
        } else if ("rectangle".equals(input)) {
            return () -> "Rectangle";
        } else if ("square".equals(input)) {
            return () -> "Square";
        }
        return null;
    }
}
