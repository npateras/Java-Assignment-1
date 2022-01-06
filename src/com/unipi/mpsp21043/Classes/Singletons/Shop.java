package com.unipi.mpsp21043.Classes.Singletons;


import com.unipi.mpsp21043.Classes.Factories.FeaturePhoneFactory;
import com.unipi.mpsp21043.Classes.Factories.Phone;
import com.unipi.mpsp21043.Classes.Factories.PhoneFactory;
import com.unipi.mpsp21043.Classes.Factories.SmartPhoneFactory;
import com.unipi.mpsp21043.Utils.Constants;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

public class Shop implements Serializable {

    private static volatile Shop sSoleInstance;

    //private constructor.
    private Shop(){

        //Prevent form the reflection api.
        if (sSoleInstance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static Shop getInstance() {
        if (sSoleInstance == null) { //if there is no instance available... create new one
            synchronized (Shop.class) {
                if (sSoleInstance == null) sSoleInstance = new Shop();
            }
        }

        return sSoleInstance;
    }

    //Make singleton from serialize and deserialize operation.
    protected Shop readResolve() {
        return getInstance();
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
