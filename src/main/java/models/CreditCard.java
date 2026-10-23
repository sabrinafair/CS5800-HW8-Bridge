package models;

import config.Config;
import org.hw8.Notification;
import org.hw8.Payment;

public class CreditCard extends Payment {

    private double balance = 0;

    public CreditCard(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void addFunds(double amount) {
        this.balance += amount;
    }

    public boolean chargeCard(double charge) {
        if(this.balance >= charge) {
            this.balance -= charge;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String makePayment(double amount) {
        if(chargeCard(amount)) return notification.sendNotification(Config.CREDIT_CARD_SUCCESS_MESSAGE);
        else return notification.sendNotification(Config.CREDIT_CARD_FAILURE_MESSAGE);
    }
}
