package org.hw8;

public abstract class Payment {

    protected Boolean paymentSuccess;

    public abstract String makePayment(double amount);
}
