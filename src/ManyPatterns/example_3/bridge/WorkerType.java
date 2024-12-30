package ManyPatterns.example_3.bridge;

public class WorkerType implements UnitType {
    @Override
    public void performAction() {
        System.out.println("Construyendo");
    }
}
