package com.unipi.mpsp21043.Classes.Factories;

public class FeaturePhones extends Phone{
    private final String screenSize;
    private final String storage;

    public FeaturePhones(String screenSize, String storage) {
        this.screenSize = screenSize;
        this.storage = storage;
    }


    @Override
    public String getScreenSize() {
        return screenSize;
    }

    @Override
    public String getStorage() {
        return storage;
    }
}
