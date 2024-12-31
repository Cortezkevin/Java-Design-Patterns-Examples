package ChainOfResponsibility.example_1;

public class OrderRoute extends HandlerRoute {
    private String routePath = "/api/orders";

    @Override
    public void handle(String route) {
        if( route.equals(routePath) ){
            System.out.println("Usando ruta de pedidos");
        }else if( hasNext() ) {
            getNext().handle(route);
        }else {
            System.out.println("Ruta desconocida");
        }
    }
}
