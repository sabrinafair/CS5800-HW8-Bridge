package models;

import org.hw8.Notification;
import org.hw8.Payment;

public class PushChannel extends Notification {
    Payment paymentMethod;

    public PushChannel(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
