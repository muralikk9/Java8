package com.java.designpatterns.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.buildShape("square");
        log.info("drawing :{} ", shape.draw());
    }
}
