package Decorator.example_1;

public class RunApp {
    public static void main(String[] args) {
        AttackBuff attackBuff = new CriticBuff(new SlowBuff(new BurnBuff(new NormalAttack())));
        attackBuff.apply();
    }
}
