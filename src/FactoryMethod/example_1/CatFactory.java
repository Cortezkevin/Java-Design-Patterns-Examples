package FactoryMethod.example_1;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal create(String name) {
        return new Cat(name);
    }
}
