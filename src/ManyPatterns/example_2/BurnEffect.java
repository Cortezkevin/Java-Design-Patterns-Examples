package ManyPatterns.example_2;

public class BurnEffect extends EffectTypeDecorator {
    public BurnEffect(EffectType effectType) {
        super(effectType);
    }

    @Override
    public void applyEffect() {
        effectType.applyEffect();
        System.out.println("Quemando por 2 segundos...");
    }

    @Override
    public String effectName() {
        return "Quemar";
    }
}
