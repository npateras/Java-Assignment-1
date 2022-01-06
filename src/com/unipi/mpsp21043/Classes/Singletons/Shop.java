package com.unipi.mpsp21043.Classes.Singletons;


import com.unipi.mpsp21043.Classes.Factories.FeaturePhoneFactory;
import com.unipi.mpsp21043.Classes.Factories.Phone;
import com.unipi.mpsp21043.Classes.Factories.PhoneFactory;
import com.unipi.mpsp21043.Classes.Factories.SmartPhoneFactory;
import com.unipi.mpsp21043.Utils.Constants;

import java.util.Objects;
import java.util.Random;

public class Shop {

    private Shop(){}
    private static class SingletonHolder{
        static final Shop shop = new Shop();
    }
    public static Shop getInstance(){
        return SingletonHolder.shop;
    }

    public Phone createRandomPhoneSpecifications(String phoneType) {
        if (Objects.equals(phoneType, Constants.SMART_PHONE)) {
            return PhoneFactory.getPhone(new SmartPhoneFactory(
                    phoneType, randomScreenSize(),
                    randomStorageSize(),
                    randomOS(),
                    randomCamera()));
        }
        else {
            return PhoneFactory.getPhone(new FeaturePhoneFactory(
                    phoneType, randomScreenSize(),
                    randomStorageSize()));
        }
    }

    private String randomScreenSize() {
        Random rand = new Random();

        return Constants.screenSizesList.get(rand.nextInt(Constants.screenSizesList.size()));
    }

    private String randomStorageSize() {
        Random rand = new Random();

        return Constants.storagesList.get(rand.nextInt(Constants.storagesList.size()));
    }

    private String randomOS() {
        Random rand = new Random();

        return Constants.osList.get(rand.nextInt(Constants.osList.size()));
    }

    private String randomCamera() {
        Random rand = new Random();

        return Constants.camerasList.get(rand.nextInt(Constants.camerasList.size()));
    }
}
