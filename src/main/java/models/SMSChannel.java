package models;

import org.hw8.Notification;
import org.hw8.Payment;

public class SMSChannel extends Notification {
    Payment paymentMethod;

    public SMSChannel(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
