package ManyPatterns.example_1.facade;

import ManyPatterns.example_1.abs_factory.StandardEcommerceFactory;

public class StandardEcommerceFacade extends EcommerceFacade {
    private static StandardEcommerceFacade INSTANCE;

    public static synchronized StandardEcommerceFacade getInstance(){
        if( INSTANCE == null ){
            INSTANCE = new StandardEcommerceFacade();
        }
        return INSTANCE;
    }

    public StandardEcommerceFacade() {
        super(new StandardEcommerceFactory());
    }
}
