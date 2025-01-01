package Decorator.example_1;

public abstract class AttackBuffDecorator implements AttackBuff {
    protected AttackBuff attackBuff;

    public AttackBuffDecorator(AttackBuff attackBuff) {
        this.attackBuff = attackBuff;
    }

    @Override
    public void apply() {
        attackBuff.apply();
    }
}
