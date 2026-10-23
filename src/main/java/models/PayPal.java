package models;

import config.Config;
import org.hw8.Notification;
import org.hw8.Payment;

public class PayPal extends Payment {
    private double balance = 0;

    public PayPal(Notification notification) {
        this.notification = notification;
    }

    public boolean chargeAccount(double charge) {
        if(this.balance >= charge) {
            this.balance -= charge;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void addFunds(double amount) {
        this.balance += amount;
    }

    @Override
    public String makePayment(double amount) {
        if(chargeAccount(amount)) return notification.sendNotification(Config.PAYPAL_SUCCESS_MESSAGE);
        else return notification.sendNotification(Config.PAYPAL_FAILURE_MESSAGE);
    }
}
