package ManyPatterns.example_3.bridge;

public class LumberCollectType extends UnitTypeDecorator {
    public LumberCollectType(UnitType unitType) {
        super(unitType);
    }

    @Override
    public void performAction() {
        unitType.performAction();
        System.out.println("Recolectando Madera");
    }
}
