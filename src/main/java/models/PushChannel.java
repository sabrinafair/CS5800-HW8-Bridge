package models;

import config.Config;
import org.hw8.Notification;
import org.hw8.Payment;

public class PushChannel implements Notification {

    public PushChannel() {
    }

    @Override
    public String sendNotification(String message) {
        return Config.PUSH_MESSAGE + " " + message;
    }
}
