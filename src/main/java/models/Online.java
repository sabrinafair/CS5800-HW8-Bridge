package models;

import config.Config;
import org.hw8.Notification;
import org.hw8.Payment;

public class Online extends Payment {
    private double balance = 0;

    public Online(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void addFunds(double amount) {
        this.balance += amount;
    }

    public boolean payOnline(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String makePayment(double amount) {
        if(payOnline(amount)) return notification.sendNotification(Config.ONLINE_SUCCESS_MESSAGE);
        else return notification.sendNotification(Config.ONLINE_FAILURE_MESSAGE);
    }
}
