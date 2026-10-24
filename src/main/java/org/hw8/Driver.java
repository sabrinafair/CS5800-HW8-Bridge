package org.hw8;

import config.Config;
import models.*;

public class Driver {
    public static void main(String[] args) {
        double initBalance = 1500.00;
        double costs = 500.00;

//        online and email,
        System.out.println("For Online and Email notifications");
        Payment paymentOnlineEmail = new Online(new EmailChannel());
        paymentOnlineEmail.addFunds(initBalance);
        System.out.println(paymentOnlineEmail.makePayment(costs));

//        online and sms,
        System.out.println("For Online and SMS notifications");
        Payment paymentOnlineSMS = new Online(new SMSChannel());
        paymentOnlineSMS.addFunds(initBalance);
        System.out.println(paymentOnlineSMS.makePayment(costs));

//        cash and email,
        System.out.println("For Cash and Email notifications");
        Payment paymentCashEmail = new Cash(new EmailChannel());
        paymentCashEmail.addFunds(initBalance);
        System.out.println(paymentCashEmail.makePayment(costs));

//        cash and sms
        System.out.println("For Cash and SMS notifications");
        Payment paymentCashSMS = new Cash(new SMSChannel());
        paymentCashSMS.addFunds(initBalance);
        System.out.println(paymentCashSMS.makePayment(costs));

        //        bitcoin and email
        System.out.println("For Bitcoin and Email notifications");
        Payment paymentBitcoinEmail = new Bitcoin(new EmailChannel());
        paymentBitcoinEmail.addFunds(initBalance);
        System.out.println(paymentBitcoinEmail.makePayment(costs));

        //        bitcoin and SMS
        System.out.println("For bitcoin and SMS notifications");
        Payment paymentBitcoinSMS = new Cash(new SMSChannel());
        paymentBitcoinSMS.addFunds(initBalance);
        System.out.println(paymentBitcoinSMS.makePayment(costs));

        //        bitcoin and push
        System.out.println("For Bitcoin and push notifications");
        Payment paymentBitcoinPush = new Bitcoin(new PushChannel());
        paymentBitcoinPush.addFunds(initBalance);
        System.out.println(paymentBitcoinPush.makePayment(costs));

        //        cash and push
        System.out.println("For cash and push notifications");
        Payment paymentCashPush = new Cash(new PushChannel());
        paymentCashPush.addFunds(initBalance);
        System.out.println(paymentCashPush.makePayment(costs));
    }
}