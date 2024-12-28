package Visitor.example_1;

/*
 * TODO -> App Example using Visitor design pattern
 * */
public class RunApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        AnimalVisitor batheVisitor = new BatheAnimalVisitor();
        dog.accept(batheVisitor);
        cat.accept(batheVisitor);

        System.out.println("----------------------------------------");

        AnimalVisitor walkingVisitor = new WalkingAnimalVisitor();

        dog.accept(walkingVisitor);
        cat.accept(walkingVisitor);

        System.out.println("----------------------------------------");

        AnimalVisitor feedVisitor = new FeedAnimalVisitor();

        cat.accept(feedVisitor);
    }
}
