package ManyPatterns.example_1.abs_factory;

import ManyPatterns.example_1.interfaces.NotificationService;
import ManyPatterns.example_1.interfaces.OrderProcessor;
import ManyPatterns.example_1.interfaces.PaymentProcessor;

public abstract class EcommerceSystemFactory {
    public abstract OrderProcessor createOrderProcessor();
    public abstract PaymentProcessor createPaymentProcessor();
    public abstract NotificationService createNotificationService();
}
