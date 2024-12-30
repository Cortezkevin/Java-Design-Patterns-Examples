package ManyPatterns.example_3.bridge;

public class GroundMobility implements MobilityType {
    @Override
    public void move() {
        System.out.println("Caminando");
    }

    @Override
    public String name() {
        return "Ground";
    }
}
