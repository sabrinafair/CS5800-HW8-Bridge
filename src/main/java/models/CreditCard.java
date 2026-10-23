package models;

import org.hw8.Payment;

public class CreditCard extends Payment {

    private double balance = 0;

    public CreditCard(double balance) {
        this.balance = balance;
    }

    public boolean chargeCard(double charge) {
        if(this.balance >= charge) {
            this.balance -= charge;
            return true;
        }else{
            return false;
        }
    }

    public void refundCard(double amount) {
        this.balance += amount;
    }

    @Override
    public String makePayment(double amount) {
        return "";
    }
}
