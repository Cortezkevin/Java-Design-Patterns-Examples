package TemplateMethod.example_2.template;

public class CevicheFood extends FoodTemplate {
    @Override
    protected void pack() {
        System.out.println("Empaquetando en un taper con orificios");
    }

    @Override
    protected void preparingIngredients() {
        System.out.println("Preparando limón, aji limo, ajos, kion y pescado");
    }

    @Override
    protected void prepare() {
        System.out.println("Agregando los ingredientes en una fuente y mezclar");
    }
}
