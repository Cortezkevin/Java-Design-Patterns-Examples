package TemplateMethod.example_1.template;

public abstract class DrinkTemplate {
    public final void make(){
        boilWater();
        addIngredient();
        serve();
        addDressings();
    }

    private void boilWater(){
        System.out.println("Hirviendo el agua...");
    }

    protected abstract void addIngredient();

    private void serve(){
        System.out.println("Sirviendo en taza...");
    }

    protected abstract void addDressings();
}
