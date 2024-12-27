package ManyPatterns.example_2;

public abstract class AttackType {
    protected DamageType damageType;
    protected EffectType effectType;

    public AttackType(DamageType damageType) {
        this.damageType = damageType;
        this.effectType = new WithoutEffect();
    }

    public void setEffectType(EffectType effectType) {
        this.effectType = effectType;
    }

    public abstract void attack();
}
