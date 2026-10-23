import models.PayPal;
import models.PushChannel;
import org.hw8.Notification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificationTest {

    Notification notification;
    @Test
    public void testPushPayPalSuccess(){
        notification = new PushChannel(new PayPal());
        assertEquals(notification.sendNotification(),);
    }
}
