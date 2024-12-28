package Visitor.example_1;

public class BatheAnimalVisitor implements AnimalVisitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Vacunando al perro");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Vacunando al gato");
    }
}
