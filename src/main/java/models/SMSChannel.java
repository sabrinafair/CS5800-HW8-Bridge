package models;

import config.Config;
import org.hw8.Notification;
import org.hw8.Payment;

public class SMSChannel implements Notification {

    public SMSChannel() {
    }

    @Override
    public String sendNotification(String message) {
        return Config.SMS_MESSAGE + " " + message;
    }
}
