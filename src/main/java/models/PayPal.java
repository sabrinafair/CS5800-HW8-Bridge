package models;

import org.hw8.Payment;

public class PayPal extends Payment {
    private double balance = 0;

    public PayPal(double balance) {
        this.balance = balance;
    }

    public boolean chargeAccount(double charge) {
        if(this.balance >= charge) {
            this.balance -= charge;
            return true;
        }else{
            return false;
        }
    }

    public void refundAccount(double amount) {
        this.balance += amount;
    }

    @Override
    public String makePayment(double amount) {
        return "";
    }
}
