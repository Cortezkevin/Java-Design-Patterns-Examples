package FactoryMethod.example_1;

public class RunApp {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.create("Lulu");

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.create("Rouse");

        dog.show();
        System.out.println("--------------------------------");
        cat.show();
    }
}
