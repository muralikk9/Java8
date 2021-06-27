package com.java.designpatterns.decorator;

public class BluetoothSpeaker extends PhoneAccessory{
    public BluetoothSpeaker(Phone phone) {
        super(phone);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + getBluetoothSpeakerPrice();
    }

    private int getBluetoothSpeakerPrice() {
        return 2000;
    }
}
