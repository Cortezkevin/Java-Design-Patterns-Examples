package ManyPatterns.example_2;

public class RangedAttackType extends AttackType {
    public RangedAttackType(DamageType damageType) {
        super(damageType);
    }

    @Override
    public void attack() {
        System.out.println("Héroe atacando a distancia, infringiendo " + damageType.damage() + " de daño " + damageType.type());
        System.out.println("Aplicando " + effectType.effectName());
        effectType.applyEffect();
    }
}
