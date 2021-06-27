package com.java.designpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PhoneTestDrive {
    public static void main(String[] args) {
        Phone iPhone = new WirelessCharger(new BluetoothSpeaker(new IPhone()));
        log.info("iPhone price with Accessories: {} " , iPhone.getPrice());
    }
}
