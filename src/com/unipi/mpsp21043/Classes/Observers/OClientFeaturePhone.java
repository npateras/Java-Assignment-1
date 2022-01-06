package com.unipi.mpsp21043.Classes.Observers;

public class OClientFeaturePhone implements INotifyFeaturePhone {

    @Override
    public void sendMessage(String msg) {
        System.out.println(msg);
    }
}
