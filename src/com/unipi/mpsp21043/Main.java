package com.unipi.mpsp21043;

import java.util.Scanner;

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

        System.out.print(numOfPhones + " " + numOfClients);
    }
}
