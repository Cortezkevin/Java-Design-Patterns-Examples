package Decorator.example_1;

public class SlowBuff extends AttackBuffDecorator {
    public SlowBuff(AttackBuff attackBuff) {
        super(attackBuff);
    }

    @Override
    public void apply() {
        attackBuff.apply();
        System.out.println("Ralentizando por 2 segundos...");
    }
}
