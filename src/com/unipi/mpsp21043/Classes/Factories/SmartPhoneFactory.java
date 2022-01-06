package com.unipi.mpsp21043.Classes.Factories;

public class SmartPhoneFactory implements PhoneAbstractFactory{
    private final String phoneType;
    private final String screenSize;
    private final String storage;
    private final String OS;
    private final String camera;

    public SmartPhoneFactory(String phoneType, String screenSize, String storage, String OS, String camera) {
        this.phoneType = phoneType;
        this.screenSize = screenSize;
        this.storage = storage;
        this.OS = OS;
        this.camera = camera;
    }

    @Override
    public Phone createPhone() {
        return new SmartPhone(phoneType, screenSize, storage, OS, camera);
    }
}
