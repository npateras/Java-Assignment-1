package com.unipi.mpsp21043.Classes.Factories;

public abstract class Phone {
    public abstract String getPhoneType();
    public abstract String getScreenSize();
    public abstract String getStorage();

    @Override
    public String toString() {
        return "Phone type: " + getPhoneType()
                + "Screen size: " + getScreenSize()
                + " Storage: " + getStorage();
    }
}
