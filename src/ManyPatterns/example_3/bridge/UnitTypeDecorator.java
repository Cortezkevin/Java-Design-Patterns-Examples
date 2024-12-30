package ManyPatterns.example_3.bridge;

public abstract class UnitTypeDecorator implements UnitType {
    protected UnitType unitType;

    public UnitTypeDecorator(UnitType unitType) {
        this.unitType = unitType;
    }

    @Override
    public void performAction() {
        unitType.performAction();
    }
}
