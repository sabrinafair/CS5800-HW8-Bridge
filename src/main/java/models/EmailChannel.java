package models;

import org.hw8.Notification;
import org.hw8.Payment;

public class EmailChannel extends Notification {
    Payment paymentMethod;

    public EmailChannel(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
