package TemplateMethod.example_2.template;

public abstract class FoodTemplate {
    public void make(){
        takeOrder();
        preparingIngredients();
        prepare();
        pack();
        deliver();
    }

    private void takeOrder(){
        System.out.println("Tomando pedido...");
    }

    protected abstract void preparingIngredients();
    protected abstract void prepare();
    protected abstract void pack();

    private void deliver(){
        System.out.println("Enviando pedido...");
    }
}
