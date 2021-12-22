package com.unipi.mpsp21043;

public class SmartPhoneFactory implements PhoneAbstractFactory{
    private final int screenSize;
    private final int storage;
    private final String phoneNumber;
    private final String OS;

    public SmartPhoneFactory(int screenSize, int storage, String phoneNumber, String OS) {
        this.screenSize = screenSize;
        this.storage = storage;
        this.phoneNumber = phoneNumber;
        this.OS = OS;
    }

    @Override
    public Phone createPhone() {
        return new SmartPhone(screenSize,storage,phoneNumber,OS);
    }
}
