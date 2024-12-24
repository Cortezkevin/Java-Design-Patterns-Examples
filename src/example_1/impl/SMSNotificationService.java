package example_1.impl;

import example_1.interfaces.NotificationService;

public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Notificación enviada por SMS.");
    }
}
