package AbstractFactory.example_1;

public abstract class Structure implements Race {
    private String name;

    public Structure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Structure setName(String name) {
        this.name = name;
        return this;
    }

    public abstract void show();

    @Override
    public String toString() {
        return "Structure{" +
                "name='" + name + '\'' +
                '}';
    }
}
