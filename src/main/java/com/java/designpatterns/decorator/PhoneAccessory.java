package com.java.designpatterns.decorator;

public abstract class PhoneAccessory implements Phone {
    private Phone phone;

    protected PhoneAccessory(Phone phone) {
        this.phone = phone;
    }

    @Override
    public int getPrice() {
        return phone.getPrice();
    }
}
