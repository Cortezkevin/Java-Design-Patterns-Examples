package ChainOfResponsibility.example_1;

public class RunApp {
    public static void main(String[] args) {
        HandlerRoute orderRouter = new OrderRoute();
        HandlerRoute paymentRouter = new PaymentRouter();
        HandlerRoute productRouter = new ProductRouter();

        orderRouter.setNext(paymentRouter);
        paymentRouter.setNext(productRouter);

        orderRouter.handle("/api/payment");

    }
}
