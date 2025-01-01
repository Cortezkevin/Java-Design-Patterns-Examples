package Factory.example_1;

public class Human extends Unit{
    public Human(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Mostrando unidad humana: ");
        System.out.println(this);
    }
}
