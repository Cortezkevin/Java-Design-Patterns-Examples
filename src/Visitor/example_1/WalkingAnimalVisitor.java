package Visitor.example_1;

public class WalkingAnimalVisitor implements AnimalVisitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Paseando al perro");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Paseando al gato");
    }
}
