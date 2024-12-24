package example_1.abs_factory;

import example_1.impl.ExpressOrderProcessor;
import example_1.impl.PaypalPaymentProcessor;
import example_1.impl.SMSNotificationService;
import example_1.interfaces.NotificationService;
import example_1.interfaces.OrderProcessor;
import example_1.interfaces.PaymentProcessor;

public class ExpressEcommerceFactory extends EcommerceSystemFactory {
    @Override
    public OrderProcessor createOrderProcessor() {
        return new ExpressOrderProcessor();
    }

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new PaypalPaymentProcessor();
    }

    @Override
    public NotificationService createNotificationService() {
        return new SMSNotificationService();
    }
}
