package com.unipi.mpsp21043;

public class FeaturePhoneFactory implements PhoneAbstractFactory{
    private final int screenSize;
    private final int storage;
    private final String phoneNumber;

    public FeaturePhoneFactory(int screenSize, int storage, String phoneNumber) {
        this.screenSize = screenSize;
        this.storage = storage;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Phone createPhone() {
        return new FeaturePhones(screenSize,storage,phoneNumber);
    }
}
