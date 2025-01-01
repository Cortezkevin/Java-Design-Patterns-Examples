package Decorator.example_1;

public class BurnBuff extends AttackBuffDecorator {
    public BurnBuff(AttackBuff attackBuff) {
        super(attackBuff);
    }

    @Override
    public void apply() {
        attackBuff.apply();
        System.out.println("Quemando por 2 segundos...");
    }
}
