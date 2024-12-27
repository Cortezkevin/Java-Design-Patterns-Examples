package ManyPatterns.example_1.facade;

import ManyPatterns.example_1.abs_factory.ExpressEcommerceFactory;

public class ExpressEcommerceFacade extends EcommerceFacade {
    private static ExpressEcommerceFacade INSTANCE;

    public static synchronized ExpressEcommerceFacade getInstance(){
        if( INSTANCE == null ){
            INSTANCE = new ExpressEcommerceFacade();
        }
        return INSTANCE;
    }

    public ExpressEcommerceFacade() {
        super(new ExpressEcommerceFactory());
    }
}
