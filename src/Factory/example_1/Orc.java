package Factory.example_1;

public class Orc extends Unit{
    public Orc(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Mostrando unidad orca: ");
        System.out.println(this);
    }
}
