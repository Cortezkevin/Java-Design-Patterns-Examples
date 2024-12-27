package ManyPatterns.example_1.impl;

import ManyPatterns.example_1.interfaces.OrderProcessor;

public class ExpressOrderProcessor implements OrderProcessor {
    @Override
    public void processOrder() {
        System.out.println("Pedido procesado con entrega exprés.");
    }
}
