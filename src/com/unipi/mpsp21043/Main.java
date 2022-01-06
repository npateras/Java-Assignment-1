package com.unipi.mpsp21043;

import com.unipi.mpsp21043.Classes.Factories.FeaturePhoneFactory;
import com.unipi.mpsp21043.Classes.Factories.Phone;
import com.unipi.mpsp21043.Classes.Factories.PhoneFactory;
import com.unipi.mpsp21043.Classes.Factories.SmartPhoneFactory;
import com.unipi.mpsp21043.Classes.Observers.OClient;
import com.unipi.mpsp21043.Classes.Observers.OStaff;
import com.unipi.mpsp21043.Classes.Observers.Client;
import com.unipi.mpsp21043.Classes.Singletons.Shop;
import com.unipi.mpsp21043.Utils.Constants;
import static org.junit.Assert.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        // READ number of phones to be produced.
        System.out.println("Enter the amount of phones that need to given to clients: ");

        Scanner inputScan = new Scanner(System.in);
        int numOfPhones = inputScan.nextInt();
        // If the num input is below 1, prompt for another value
        while((numOfPhones < 1))
        {
            System.out.print("Invalid value! Enter the amount of phones that need to given to clients (valid values are from 1 and above): ");

            numOfPhones = inputScan.nextInt();
        }

        // READ number of clients.
        System.out.println("Enter the number of clients: ");

        int numOfClients = inputScan.nextInt();

        // If the num input is below 1, prompt for another value
        while((numOfClients < 1))
        {
            System.out.print("Invalid value! Enter the number of clients (valid values are from 1 and above): ");

            numOfClients = inputScan.nextInt();
        }

        inputScan.close();


        Client[] arrayClients;

        arrayClients = new Client[numOfClients];

        // OBSERVANT
        OStaff observableStaff = new OStaff();

        // For each client
        for (int i = 0; i < numOfClients; i++) {
            String phoneChoice = Constants.phoneChoicesListRandomElement();

            OClient observerClient = new OClient();

            observableStaff.addObserver(observerClient);

            arrayClients[i] = new Client(
                    UUID.randomUUID().toString(),
                    phoneChoice);
        }

        Shop shopInstance = Shop.getInstance();

        Random rand = new Random();
        for (int i = 0; i < numOfClients; i++) {
            String phoneToBeCreated = Constants.phoneChoicesListRandomElement();
            Phone phone = shopInstance.createRandomPhoneSpecifications(phoneToBeCreated);
            observableStaff.notifyUpdate(phoneToBeCreated);
        }
    }
}
