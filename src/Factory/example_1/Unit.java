package Factory.example_1;

public abstract class Unit {
    private String name;

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Unit setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void show();
}
