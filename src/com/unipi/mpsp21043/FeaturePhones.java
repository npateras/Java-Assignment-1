package com.unipi.mpsp21043;

public class FeaturePhones extends Phone{
    private final int screenSize;
    private final int storage;
    private final String phoneNumber;

    public FeaturePhones(int screenSize, int storage, String phoneNumber) {
        this.screenSize = screenSize;
        this.storage = storage;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public int getScreenSize() {
        return screenSize;
    }

    @Override
    public int getStorage() {
        return storage;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
