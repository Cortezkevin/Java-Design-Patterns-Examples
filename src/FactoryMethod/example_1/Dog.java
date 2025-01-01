package FactoryMethod.example_1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Mostrando perro: ");
        System.out.println(this);
    }
}
