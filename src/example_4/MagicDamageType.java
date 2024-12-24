package example_4;

public class MagicDamageType implements DamageType {
    @Override
    public Integer damage() {
        return 100;
    }

    @Override
    public String type() {
        return "Magico";
    }
}
