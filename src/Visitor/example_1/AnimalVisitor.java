package Visitor.example_1;

public interface AnimalVisitor {
    void visit(Dog dog);
    void visit(Cat cat);
}
