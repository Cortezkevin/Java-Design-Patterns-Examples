package Visitor.example_1;

public class FeedAnimalVisitor implements AnimalVisitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Alimentando al perro");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Alimentando al gato");
    }
}
