package com.unipi.mpsp21043.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class Constants {

    public static final String SMART_PHONE = "Smartphone";
    public static final String FEATURE_PHONE = "Featurephone";

    // List with string elements.
    public static final List<String> phoneChoicesList = Arrays.asList(SMART_PHONE, FEATURE_PHONE);

    // Lists with specifications
    public static final List<String> screenSizesList = Arrays.asList("828 x 1792", "1125 x 2436", "1242 x 2688", "1125 x 2436", "1080 x 1920", "750 x 1334");
    public static final List<String> storagesList = Arrays.asList("32gb", "64gb", "128gb");
    public static final List<String> osList = Arrays.asList("Android 11", "Windows OS", "iOS");
    public static final List<String> camerasList = Arrays.asList("6MP", "12MP", "16", "24MP", "32MP");

    // Function that will return a random item from the list: phoneChoicesList
    public static String phoneChoicesListRandomElement() {
        Random rand = new Random();
        return phoneChoicesList.get(rand.nextInt(phoneChoicesList.size()));
    }
}
