package ManyPatterns.example_3.bridge;

public class WarriorType implements UnitType {
    @Override
    public void performAction() {
        System.out.println("Atacar");
    }
}
