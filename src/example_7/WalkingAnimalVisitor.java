package example_7;

public class WalkingAnimalVisitor implements AnimalVisitor {
    @Override
    public void visit(Perro perro) {
        System.out.println("Paseando al perro");
    }

    @Override
    public void visit(Gato gato) {
        System.out.println("Paseando al gato");
    }
}
