package com.unipi.mpsp21043.Classes.Factories;

public class FeaturePhoneFactory implements PhoneAbstractFactory {
    private final String phoneType;
    private final String screenSize;
    private final String storage;

    public FeaturePhoneFactory(String phoneType, String screenSize, String storage) {
        this.phoneType = phoneType;
        this.screenSize = screenSize;
        this.storage = storage;
    }

    @Override
    public Phone createPhone() {
        return new FeaturePhones(phoneType, screenSize, storage);
    }
}
