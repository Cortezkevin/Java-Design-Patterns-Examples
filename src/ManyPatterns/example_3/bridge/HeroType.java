package ManyPatterns.example_3.bridge;

public class HeroType implements UnitType {
    @Override
    public void performAction() {
        System.out.println("Liderando ejercito");
    }
}
