package Decorator.example_1;

public class NormalAttack implements AttackBuff {
    @Override
    public void apply() {
        System.out.println("Atacando sin buffs");
    }
}
