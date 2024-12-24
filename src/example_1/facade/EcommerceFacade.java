package example_1.facade;

import example_1.abs_factory.EcommerceSystemFactory;
import example_1.interfaces.NotificationService;
import example_1.interfaces.OrderProcessor;
import example_1.interfaces.PaymentProcessor;

public abstract class EcommerceFacade {
    private OrderProcessor orderProcessor;
    private PaymentProcessor paymentProcessor;
    private NotificationService notificationService;

    public EcommerceFacade(EcommerceSystemFactory factory) {
        this.orderProcessor = factory.createOrderProcessor();
        this.paymentProcessor = factory.createPaymentProcessor();
        this.notificationService = factory.createNotificationService();
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(){
        System.out.println("Procesando el pedido...");

        orderProcessor.processOrder();
        paymentProcessor.processPayment();
        notificationService.sendNotification();

        System.out.println("Pedido completado.");
    }
}
