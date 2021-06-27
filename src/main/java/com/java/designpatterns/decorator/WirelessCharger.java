package com.java.designpatterns.decorator;

public class WirelessCharger extends PhoneAccessory{
    public WirelessCharger(Phone phone) {
        super(phone);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + getWirelessChargerPrice();
    }

    private int getWirelessChargerPrice() {
        return 1000;
    }
}
