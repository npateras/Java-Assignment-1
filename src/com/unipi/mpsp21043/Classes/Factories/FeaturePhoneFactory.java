package com.unipi.mpsp21043.Classes.Factories;

public class FeaturePhoneFactory implements PhoneAbstractFactory{
    private final String screenSize;
    private final String storage;

    public FeaturePhoneFactory(String screenSize, String storage) {
        this.screenSize = screenSize;
        this.storage = storage;
    }

    @Override
    public Phone createPhone() {
        return new FeaturePhones(screenSize, storage);
    }
}
