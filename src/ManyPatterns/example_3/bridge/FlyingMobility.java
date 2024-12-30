package ManyPatterns.example_3.bridge;

public class FlyingMobility implements MobilityType {
    @Override
    public void move() {
        System.out.println("Volando");
    }

    @Override
    public String name() {
        return "Flying";
    }
}
