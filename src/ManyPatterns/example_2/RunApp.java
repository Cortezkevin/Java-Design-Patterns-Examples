package ManyPatterns.example_2;

/*
 * TODO -> App Example using Bridge and Decorator design patterns
 * */
public class RunApp {
    public static void main(String[] args) {
        AttackType attackType = new RangedAttackType(new PhysicDamageType());
        attackType.setEffectType(new BurnEffect(new SlowDownEffect(new WithoutEffect())));
        attackType.attack();
    }
}
