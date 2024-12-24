package example_7;

/*
 * TODO -> App Example using Visitor design pattern
 * */
public class RunApp {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();

        AnimalVisitor batheVisitor = new BatheAnimalVisitor();
        perro.accept(batheVisitor);
        gato.accept(batheVisitor);

        System.out.println("----------------------------------------");

        AnimalVisitor walkingVisitor = new WalkingAnimalVisitor();

        perro.accept(walkingVisitor);
        gato.accept(walkingVisitor);

        System.out.println("----------------------------------------");

        AnimalVisitor feedVisitor = new FeedAnimalVisitor();

        gato.accept(feedVisitor);
    }
}
