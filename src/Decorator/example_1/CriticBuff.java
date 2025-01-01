package Decorator.example_1;

public class CriticBuff extends AttackBuffDecorator {
    public CriticBuff(AttackBuff attackBuff) {
        super(attackBuff);
    }

    @Override
    public void apply() {
        attackBuff.apply();
        System.out.println("Aplicando daño critico...");
    }
}
