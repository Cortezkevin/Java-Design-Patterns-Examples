package Visitor.example_1;

public class Gato implements Animal {
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }
}
