package ChainOfResponsibility.example_1;

public class ProductRouter extends HandlerRoute {
    private String routePath = "/api/products";

    @Override
    public void handle(String route) {
        if( route.equals(routePath) ){
            System.out.println("Usando ruta de productos");
        }else if( hasNext() ) {
            getNext().handle(route);
        }else {
            System.out.println("Ruta desconocida");
        }
    }
}
