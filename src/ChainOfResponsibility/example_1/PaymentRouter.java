package ChainOfResponsibility.example_1;

public class PaymentRouter extends HandlerRoute {
    private String routePath = "/api/payment";

    @Override
    public void handle(String route) {
        if( route.equals(routePath) ){
            System.out.println("Usando ruta de pagos");
        }else if( hasNext() ) {
            getNext().handle(route);
        }else {
            System.out.println("Ruta desconocida");
        }
    }
}
