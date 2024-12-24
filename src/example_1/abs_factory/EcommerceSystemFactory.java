package example_1.abs_factory;

import example_1.interfaces.NotificationService;
import example_1.interfaces.OrderProcessor;
import example_1.interfaces.PaymentProcessor;

public abstract class EcommerceSystemFactory {
    public abstract OrderProcessor createOrderProcessor();
    public abstract PaymentProcessor createPaymentProcessor();
    public abstract NotificationService createNotificationService();
}
