package Facade.example_1;

public class PizzaFacade {
    private Ketchup ketchup;
    private Mass mass;
    private Furnace furnace;
    private AdditionalIngredients additionalIngredients;
    private Cheese cheese;

    public PizzaFacade() {
        this.ketchup = new Ketchup();
        this.mass = new Mass();
        this.furnace = new Furnace();
        this.additionalIngredients = new AdditionalIngredients();
        this.cheese = new Cheese();
    }

    public void makePizza(){
        mass.makeMass();
        ketchup.addKetchup();
        cheese.addCheese();
        additionalIngredients.addIngredients();
        furnace.bake();
    }
}
