package com.unipi.mpsp21043;

public class SmartPhone extends Phone{
    private final int screenSize;
    private final int storage;
    private final String phoneNumber;
    private final String OS;

    public String getOS() {
        return OS;
    }

    public SmartPhone(int screenSize, int storage, String phoneNumber, String OS) {
        this.screenSize = screenSize;
        this.storage = storage;
        this.phoneNumber = phoneNumber;
        this.OS = OS;
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

    @Override
    public String toString() {
        return super.toString()
                +"OS: "+getOS();
    }
}
