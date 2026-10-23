package org.hw8;

public abstract class Notification {
    protected Payment paymentMethod;

    abstract public void sendNotification();
}
