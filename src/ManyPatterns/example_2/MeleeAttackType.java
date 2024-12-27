package ManyPatterns.example_2;

public class MeleeAttackType extends AttackType {
    public MeleeAttackType(DamageType damageType) {
        super(damageType);
    }

    @Override
    public void attack() {
        System.out.println("Héroe atacando cuerpo a cuerpo, infringiendo " + damageType.damage() + " de daño " + damageType.type());
        effectType.applyEffect();
    }
}
