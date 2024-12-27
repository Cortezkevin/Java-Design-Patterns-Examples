package ManyPatterns.example_1.impl;

import ManyPatterns.example_1.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Notificación enviada por correo electrónico.");
    }
}
