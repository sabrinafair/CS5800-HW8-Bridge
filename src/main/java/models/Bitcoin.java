package models;

import config.Config;
import org.hw8.Notification;
import org.hw8.Payment;

public class Bitcoin extends Payment {
    private double balance = 0;

    public Bitcoin(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void addFunds(double amount) {
        this.balance += amount;
    }

    public boolean payFunds(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String makePayment(double amount) {
        if(payFunds(amount)) return notification.sendNotification(Config.BITCOIN_SUCCESS_MESSAGE);
        else return notification.sendNotification(Config.BITCOIN_FAILURE_MESSAGE);
    }
}
