package com.java.designpatterns.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonTestDrive {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        log.info("{}", singleton.test());
    }
}
