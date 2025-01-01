package TemplateMethod.example_1.template;

public class TeDrink extends DrinkTemplate {
    @Override
    protected void addDressings() {
        System.out.println("Añadiendo gotas de limón y azúcar...");
    }

    @Override
    protected void addIngredient() {
        System.out.println("Añadiendo té...");
    }
}
