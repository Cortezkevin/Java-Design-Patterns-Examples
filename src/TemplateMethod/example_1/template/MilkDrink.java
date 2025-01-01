package TemplateMethod.example_1.template;

public class MilkDrink extends DrinkTemplate {
    @Override
    protected void addDressings() {
        System.out.println("Añadiendo azúcar...");
    }

    @Override
    protected void addIngredient() {
        System.out.println("Añadiendo leche...");
    }
}
