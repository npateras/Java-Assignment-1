package com.unipi.mpsp21043.Classes.Factories;

public class SmartPhone extends Phone{
    private final String screenSize;
    private final String storage;
    private final String OS;
    private final String camera;

    public SmartPhone(String screenSize, String storage, String OS, String camera) {
        this.screenSize = screenSize;
        this.storage = storage;
        this.OS = OS;
        this.camera = camera;
    }

    @Override
    public String getScreenSize() {
        return screenSize;
    }

    @Override
    public String getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return super.toString()
                +" OS: "+getOS();
    }

    public String getOS() {
        return OS;
    }

    public String getCamera() {
        return camera;
    }
}
