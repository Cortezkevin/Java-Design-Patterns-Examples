package example_1;

import example_1.adapter.LegacyPaymentAdapter;
import example_1.adapter.LegacyPaymentProcessor;
import example_1.facade.EcommerceFacade;
import example_1.facade.StandardEcommerceFacade;

/*
* TODO -> App Example using AbstractFactory, Facade, Singleton and Adapter design patterns
* */
public class RunApp {
    public static void main(String[] args) {
        EcommerceFacade ecommerceFacade = StandardEcommerceFacade.getInstance();

        LegacyPaymentAdapter adapter = new LegacyPaymentAdapter(new LegacyPaymentProcessor());
        ecommerceFacade.setPaymentProcessor( adapter );

        ecommerceFacade.processOrder();
    }
}