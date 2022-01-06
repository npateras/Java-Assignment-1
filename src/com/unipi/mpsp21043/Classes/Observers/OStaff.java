package com.unipi.mpsp21043.Classes.Observers;

import java.util.ArrayList;
import java.util.List;

public class OStaff {
    private String phoneType;

    private List<INotifyFeaturePhone> interestedClients = new ArrayList<INotifyFeaturePhone>();

    public void addObserver(INotifyFeaturePhone iNotifyClient) {
        this.interestedClients.add(iNotifyClient);
    }

    public void removeObserver(INotifyFeaturePhone iNotifyClient) {
        this.interestedClients.remove(iNotifyClient);
    }

    public void notifyUpdate(String phoneType) {
        this.phoneType = phoneType;
        for (INotifyFeaturePhone iNotifyClient: this.interestedClients) {
            iNotifyClient.sendMessage("A new " + phoneType + " was produced and it's available!");
        }
    }

}
