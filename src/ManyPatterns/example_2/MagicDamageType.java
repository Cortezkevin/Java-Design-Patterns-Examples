package ManyPatterns.example_2;

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
