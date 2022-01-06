package com.unipi.mpsp21043;

import com.unipi.mpsp21043.Classes.Factories.Phone;
import com.unipi.mpsp21043.Classes.Observers.OClientFeaturePhone;
import com.unipi.mpsp21043.Classes.Observers.OClientSmartPhone;
import com.unipi.mpsp21043.Classes.Observers.OStaff;
import com.unipi.mpsp21043.Classes.Observers.Client;
import com.unipi.mpsp21043.Classes.Singletons.Shop;
import com.unipi.mpsp21043.Utils.Constants;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // READ number of phones to be produced.
        System.out.println("Enter the amount of phones that need to given to clients: ");

        Scanner inputScan = new Scanner(System.in);
        int numOfPhones = inputScan.nextInt();
        // If the num input is below 1, prompt for another value
        while ((numOfPhones < 1)) {
            System.out.print("Invalid value! Enter the amount of phones that need to given to clients (valid values are from 1 and above): ");

            numOfPhones = inputScan.nextInt();
        }

        // READ number of clients.
        System.out.println("Enter the number of clients: ");

        int numOfClients = inputScan.nextInt();

        // If the num input is below 1, prompt for another value
        while ((numOfClients < 1)) {
            System.out.print("Invalid value! Enter the number of clients (valid values are from 1 and above): ");

            numOfClients = inputScan.nextInt();
        }

        inputScan.close();


        Client[] clientList;

        clientList = new Client[numOfClients];

        // OBSERVANT
        OStaff observableStaff = new OStaff();

        // For each client
        for (int i = 0; i < numOfClients; i++) {
            String phoneChoice = Constants.phoneChoicesListRandomElement();

            OClientFeaturePhone observerFeaturePhoneClient = new OClientFeaturePhone();
            OClientSmartPhone observerSmartPhoneClient = new OClientSmartPhone();

            if (Objects.equals(phoneChoice, Constants.SMART_PHONE))
                observableStaff.addSmartPhoneObserver(observerSmartPhoneClient);
            else
                observableStaff.addFeaturePhoneObserver(observerFeaturePhoneClient);

            clientList[i] = new Client(
                    UUID.randomUUID().toString(),
                    phoneChoice,
                    false);
        }

        Shop shopInstance = Shop.getInstance();

        List<Phone> arrayCreatedPhones = new ArrayList<Phone>();
        boolean isFeaturePhones = false;
        boolean isSmartPhones = false;

        for (int i = 0; i < numOfPhones; i++) {
            String phoneToBeCreated = Constants.phoneChoicesListRandomElement();
            arrayCreatedPhones.add(shopInstance.createRandomPhoneSpecifications(phoneToBeCreated));

            if (Objects.equals(phoneToBeCreated, Constants.SMART_PHONE))
                isSmartPhones = true;
            else
                isFeaturePhones = true;
        }

        if (isSmartPhones)
            observableStaff.notifySmartPhoneUpdate();
        if (isFeaturePhones)
            observableStaff.notifyFeaturePhoneUpdate();

        System.out.println("");
        for (int i=0; i < arrayCreatedPhones.size(); i++) {
            if (Objects.equals(clientList[i].getPhoneChoice(), Constants.SMART_PHONE)) {
                if (arrayCreatedPhones.get(i).getPhoneType().equals(Constants.SMART_PHONE)) {
                    clientList[i].setReceivedPhone(true);
                    arrayCreatedPhones.remove(i);

                    System.out.println("Client is taking a picture...");
                }
            }
            else {
                if (arrayCreatedPhones.get(i).getPhoneType().equals(Constants.FEATURE_PHONE)) {
                    clientList[i].setReceivedPhone(true);
                    arrayCreatedPhones.remove(i);

                    System.out.println("Client is calling a number...");
                }
            }
        }
    }
}
