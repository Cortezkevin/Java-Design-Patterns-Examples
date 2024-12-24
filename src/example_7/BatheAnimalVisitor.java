package example_7;

public class BatheAnimalVisitor implements AnimalVisitor {
    @Override
    public void visit(Perro perro) {
        System.out.println("Vacunando al perro");
    }

    @Override
    public void visit(Gato gato) {
        System.out.println("Vacunando al gato");
    }
}
