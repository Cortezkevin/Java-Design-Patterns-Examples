package AbstractFactory.example_1;

public abstract class Unit implements Race {
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

    public abstract void show();

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                '}';
    }
}
