package AbstractFactory.example_1;

public abstract class Hero implements Race {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Hero setName(String name) {
        this.name = name;
        return this;
    }

    public abstract void show();

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }
}
