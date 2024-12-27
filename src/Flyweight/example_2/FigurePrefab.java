package Flyweight.example_2;

public class FigurePrefab {
    private static int id = 0;
    private String color;
    private Integer size;

    public FigurePrefab(String color, Integer size) {
        this.color = color;
        this.size = size;
        id++;
    }

    @Override
    public String toString() {
        return "FigurePrefab{" +
                "id='" + id + '\'' +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    public int getId() {
        return id;
    }

    public static int id(){
        return id;
    }

    public String getColor() {
        return color;
    }

    public Integer getSize() {
        return size;
    }
}
