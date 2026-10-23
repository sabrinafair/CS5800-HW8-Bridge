package org.hw8;

public abstract class Payment {
    protected Notification notification;

    public abstract String makePayment(double amount);
    public abstract void addFunds(double amount);

}
