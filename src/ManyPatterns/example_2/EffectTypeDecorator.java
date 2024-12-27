package ManyPatterns.example_2;

public abstract class EffectTypeDecorator implements EffectType {
    protected EffectType effectType;

    public EffectTypeDecorator(EffectType effectType) {
        this.effectType = effectType;
    }

    @Override
    public void applyEffect() {
        effectType.applyEffect();
    }

    @Override
    public String effectName() {
        return effectType.effectName();
    }
}
