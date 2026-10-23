package models;

import config.Config;
import org.hw8.Notification;
import org.hw8.Payment;

public class EmailChannel implements Notification {

    public EmailChannel() {
    }

    @Override
    public String sendNotification(String message) {
        return Config.EMAIL_MESSAGE + " " + message;
    }
}
