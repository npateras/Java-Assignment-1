package com.unipi.mpsp21043.Classes.Observers;

import java.util.ArrayList;
import java.util.List;

public class OStaff {
    private String phoneType;

    private List<INotifySmartPhone> interestedSmartPhoneClients = new ArrayList<INotifySmartPhone>();
    private List<INotifyFeaturePhone> interestedFeaturePhoneClients = new ArrayList<INotifyFeaturePhone>();

    public void addSmartPhoneObserver(INotifySmartPhone iNotifyClient) {
        this.interestedSmartPhoneClients.add(iNotifyClient);
    }

    public void addFeaturePhoneObserver(INotifyFeaturePhone iNotifyClient) {
        this.interestedFeaturePhoneClients.add(iNotifyClient);
    }


    public void removeSmartPhoneObserver(INotifySmartPhone iNotifyClient) {
        this.interestedSmartPhoneClients.remove(iNotifyClient);
    }

    public void removeFeaturePhoneObserver(INotifyFeaturePhone iNotifyClient) {
        this.interestedFeaturePhoneClients.remove(iNotifyClient);
    }

    public void notifySmartPhoneUpdate() {
        for (INotifySmartPhone iNotifyClient: this.interestedSmartPhoneClients) {
            iNotifyClient.sendMessage("A new Smartphone was produced and it's available!");
        }
    }

    public void notifyFeaturePhoneUpdate() {
        for (INotifyFeaturePhone iNotifyClient: this.interestedFeaturePhoneClients) {
            iNotifyClient.sendMessage("A new Featurephone was produced and it's available!");
        }
    }

}
