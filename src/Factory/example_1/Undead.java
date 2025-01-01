package Factory.example_1;

public class Undead extends Unit{
    public Undead(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Mostrando unidad no-muerta: ");
        System.out.println(this);
    }
}
