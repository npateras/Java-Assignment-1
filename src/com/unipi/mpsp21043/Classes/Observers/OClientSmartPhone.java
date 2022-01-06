package com.unipi.mpsp21043.Classes.Observers;

public class OClientSmartPhone implements INotifySmartPhone {

    @Override
    public void sendMessage(String msg) {
        System.out.println(msg);
    }
}
