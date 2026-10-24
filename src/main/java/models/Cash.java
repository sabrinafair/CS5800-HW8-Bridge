package models;

import config.Config;
import org.hw8.Notification;
import org.hw8.Payment;

public class Cash extends Payment {

    private double balance = 0;

    public Cash(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void addFunds(double amount) {
        this.balance += amount;
    }

    public boolean payCash(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String makePayment(double amount) {
        if(payCash(amount)) return notification.sendNotification(Config.CASH_SUCCESS_MESSAGE);
        else return notification.sendNotification(Config.CASH_FAILURE_MESSAGE);
    }
}
