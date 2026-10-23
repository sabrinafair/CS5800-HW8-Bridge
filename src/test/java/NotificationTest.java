import config.Config;
import models.*;
import org.hw8.Notification;
import org.hw8.Payment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificationTest {

    Payment payment;

    //PUSH
    @Test
    public void testPushPayPalSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new PayPal(new PushChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.PUSH_MESSAGE + " " + Config.PAYPAL_SUCCESS_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testPushCreditCardSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new CreditCard(new PushChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.PUSH_MESSAGE + " " + Config.CREDIT_CARD_SUCCESS_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testPushPayPalFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new PayPal(new PushChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.PUSH_MESSAGE + " " + Config.PAYPAL_FAILURE_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testPushCreditCardFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new CreditCard(new PushChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.PUSH_MESSAGE + " " + Config.CREDIT_CARD_FAILURE_MESSAGE, payment.makePayment(costs));
    }

    //SMS
    @Test
    public void testSMSPayPalSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new PayPal(new SMSChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.SMS_MESSAGE + " " + Config.PAYPAL_SUCCESS_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testSMSCreditCardSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new CreditCard(new SMSChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.SMS_MESSAGE + " " + Config.CREDIT_CARD_SUCCESS_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testSMSPayPalFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new PayPal(new SMSChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.SMS_MESSAGE + " " + Config.PAYPAL_FAILURE_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testSMSCreditCardFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new CreditCard(new SMSChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.SMS_MESSAGE + " " + Config.CREDIT_CARD_FAILURE_MESSAGE, payment.makePayment(costs));
    }

    //Email
    @Test
    public void testEmailPayPalSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new PayPal(new EmailChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.EMAIL_MESSAGE + " " + Config.PAYPAL_SUCCESS_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testEmailCreditCardSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new CreditCard(new EmailChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.EMAIL_MESSAGE + " " + Config.CREDIT_CARD_SUCCESS_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testEmailPayPalFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new PayPal(new EmailChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.EMAIL_MESSAGE + " " + Config.PAYPAL_FAILURE_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testEmailCreditCardFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new CreditCard(new EmailChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.EMAIL_MESSAGE + " " + Config.CREDIT_CARD_FAILURE_MESSAGE, payment.makePayment(costs));
    }
}
