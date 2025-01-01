package FactoryMethod.example_1;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal create(String name) {
        return new Dog(name);
    }
}
