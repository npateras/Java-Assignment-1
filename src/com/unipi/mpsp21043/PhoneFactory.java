package com.unipi.mpsp21043;

public class PhoneFactory {
    public static Phone getPhone(PhoneAbstractFactory factory){
        return factory.createPhone();
    }
}
