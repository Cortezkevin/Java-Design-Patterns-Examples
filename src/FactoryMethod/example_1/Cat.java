package FactoryMethod.example_1;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Mostrando gato: ");
        System.out.println(this);
    }
}

