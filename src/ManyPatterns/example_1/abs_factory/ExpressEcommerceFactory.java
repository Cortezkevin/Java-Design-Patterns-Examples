package ManyPatterns.example_1.abs_factory;

import ManyPatterns.example_1.impl.ExpressOrderProcessor;
import ManyPatterns.example_1.impl.PaypalPaymentProcessor;
import ManyPatterns.example_1.impl.SMSNotificationService;
import ManyPatterns.example_1.interfaces.NotificationService;
import ManyPatterns.example_1.interfaces.OrderProcessor;
import ManyPatterns.example_1.interfaces.PaymentProcessor;

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
