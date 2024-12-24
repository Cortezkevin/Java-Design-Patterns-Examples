package example_4;

public class SlowDownEffect extends EffectTypeDecorator {
    public SlowDownEffect(EffectType effectType) {
        super(effectType);
    }

    @Override
    public void applyEffect() {
        effectType.applyEffect();
        System.out.println("Ralentizando durante 2 segundos...");
    }

    @Override
    public String effectName() {
        return "Ralentizar";
    }
}
