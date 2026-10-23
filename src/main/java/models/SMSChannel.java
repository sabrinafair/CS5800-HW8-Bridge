package models;

import org.hw8.Notification;
import org.hw8.Payment;

public class SMSChannel extends Notification {

    public SMSChannel(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void sendNotification() {
        if(this.paymentMethod.paymentSuccess()) System.out.println(this.paymentMethod.paymentSuccessMessage());
        else System.out.println(this.paymentMethod.paymentFailMessage());
    }
}
