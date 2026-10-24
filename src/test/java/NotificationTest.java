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
    public void testPushOnlineSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new Online(new PushChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.PUSH_MESSAGE + " " + Config.ONLINE_SUCCESS_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testPushCashSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new Cash(new PushChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.PUSH_MESSAGE + " " + Config.CASH_SUCCESS_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testPushBitcoinSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new Bitcoin(new PushChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.PUSH_MESSAGE + " " + Config.BITCOIN_SUCCESS_MESSAGE, payment.makePayment(costs));
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

    @Test
    public void testPushOnlineFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new Online(new PushChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.PUSH_MESSAGE + " " + Config.ONLINE_FAILURE_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testPushCashFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new Cash(new PushChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.PUSH_MESSAGE + " " + Config.CASH_FAILURE_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testPushBitcoinFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new Bitcoin(new PushChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.PUSH_MESSAGE + " " + Config.BITCOIN_FAILURE_MESSAGE, payment.makePayment(costs));
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
    public void testSMSOnlineSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new Online(new SMSChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.SMS_MESSAGE + " " + Config.ONLINE_SUCCESS_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testSMSCashSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new Cash(new SMSChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.SMS_MESSAGE + " " + Config.CASH_SUCCESS_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testSMSBitcoinSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new Bitcoin(new SMSChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.SMS_MESSAGE + " " + Config.BITCOIN_SUCCESS_MESSAGE, payment.makePayment(costs));
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

    @Test
    public void testSMSOnlineFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new Online(new SMSChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.SMS_MESSAGE + " " + Config.ONLINE_FAILURE_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testSMSCashFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new Cash(new SMSChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.SMS_MESSAGE + " " + Config.CASH_FAILURE_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testSMSBitcoinFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new Bitcoin(new SMSChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.SMS_MESSAGE + " " + Config.BITCOIN_FAILURE_MESSAGE, payment.makePayment(costs));
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
    public void testEmailOnlineSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new Online(new EmailChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.EMAIL_MESSAGE + " " + Config.ONLINE_SUCCESS_MESSAGE, payment.makePayment(costs));
    }
    @Test
    public void testEmailCashSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new Cash(new EmailChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.EMAIL_MESSAGE + " " + Config.CASH_SUCCESS_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testEmailBitcoinSuccess(){
        double initBalance = 1500.00;
        double costs = 500.00;
        payment = new Bitcoin(new EmailChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.EMAIL_MESSAGE + " " + Config.BITCOIN_SUCCESS_MESSAGE, payment.makePayment(costs));
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
    @Test
    public void testEmailOnlineFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new Online(new EmailChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.EMAIL_MESSAGE + " " + Config.ONLINE_FAILURE_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testEmailCashFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new Cash(new EmailChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.EMAIL_MESSAGE + " " + Config.CASH_FAILURE_MESSAGE, payment.makePayment(costs));
    }

    @Test
    public void testEmailBitcoinFailure(){
        double initBalance = 0.00;
        double costs = 500.00;
        payment = new Bitcoin(new EmailChannel());
        payment.addFunds(initBalance);
        assertEquals(Config.EMAIL_MESSAGE + " " + Config.BITCOIN_FAILURE_MESSAGE, payment.makePayment(costs));
    }
}
