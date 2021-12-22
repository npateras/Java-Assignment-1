package com.unipi.mpsp21043;

public class Client {
    private String id;
    private String phoneChoice;

    public Client(String id, String phoneChoice) {
        this.id = id;
        this.phoneChoice = phoneChoice;
    }

    // display() method to display
    // the client data
    public void display()
    {
        System.out.println("Client id is: " + id + " "
                + "and client's phone choice is: "
                + phoneChoice);
        System.out.println();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneChoice() {
        return phoneChoice;
    }

    public void setPhoneChoice(String phoneChoice) {
        this.phoneChoice = phoneChoice;
    }
}
