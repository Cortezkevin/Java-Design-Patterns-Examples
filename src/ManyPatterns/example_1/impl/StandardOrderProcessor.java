package ManyPatterns.example_1.impl;

import ManyPatterns.example_1.interfaces.OrderProcessor;

public class StandardOrderProcessor implements OrderProcessor {
    @Override
    public void processOrder() {
        System.out.println("Pedido procesado utilizando el flujo estándar.");
    }
}
