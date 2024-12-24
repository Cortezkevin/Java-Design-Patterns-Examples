package example_4;

public class WithoutEffect implements EffectType {
    @Override
    public void applyEffect() {
        System.out.println("No se aplicaron efectos");
    }

    @Override
    public String effectName() {
        return "Nada";
    }
}
