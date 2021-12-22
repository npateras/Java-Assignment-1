package com.unipi.mpsp21043;

public abstract class Phone {
    public abstract int getScreenSize();
    public abstract int getStorage();
    public abstract String getPhoneNumber();

    @Override
    public String toString() {
        return "Screen size: "+getScreenSize()
                +" Storage: "+getStorage()
                +" Phone number: "+getPhoneNumber();
    }
}
