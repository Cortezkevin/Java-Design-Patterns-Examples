package Visitor.example_1;

public class FeedAnimalVisitor implements AnimalVisitor {
    @Override
    public void visit(Perro perro) {
        System.out.println("Alimentando al perro");
    }

    @Override
    public void visit(Gato gato) {
        System.out.println("Alimentando al gato");
    }
}
