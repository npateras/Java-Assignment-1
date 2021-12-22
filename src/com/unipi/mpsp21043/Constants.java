package com.unipi.mpsp21043;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class Constants {
    public static final List<String> phoneChoicesList = Arrays.asList("Smartphone", "Featurephone");

    public static String phoneChoicesList_randomElement() {
        Random rand = new Random();
        return phoneChoicesList.get(rand.nextInt(phoneChoicesList.size()));
    }
}
