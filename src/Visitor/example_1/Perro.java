package Visitor.example_1;

public class Perro implements Animal {
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }
}
