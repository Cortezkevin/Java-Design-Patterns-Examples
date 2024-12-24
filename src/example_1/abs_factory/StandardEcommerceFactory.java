package example_1.abs_factory;

import example_1.impl.CreditCardPaymentProcessor;
import example_1.impl.EmailNotificationService;
import example_1.impl.StandardOrderProcessor;
import example_1.interfaces.NotificationService;
import example_1.interfaces.OrderProcessor;
import example_1.interfaces.PaymentProcessor;

public class StandardEcommerceFactory extends EcommerceSystemFactory {

    @Override
    public OrderProcessor createOrderProcessor() {
        return new StandardOrderProcessor();
    }

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CreditCardPaymentProcessor();
    }

    @Override
    public NotificationService createNotificationService() {
        return new EmailNotificationService();
    }
}
