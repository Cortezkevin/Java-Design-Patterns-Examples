package TemplateMethod.example_2.template;

public class PizzaFood extends FoodTemplate {
    @Override
    protected void pack() {
        System.out.println("Empaquetando en una caja de pizza");
    }

    @Override
    protected void preparingIngredients() {
        System.out.println("Preparando queso, salsa de tomate, masa");
    }

    @Override
    protected void prepare() {
        System.out.println("Extendiendo la masa y agregando los ingredientes");
    }
}
