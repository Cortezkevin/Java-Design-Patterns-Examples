package Flyweight.example_2;

public class Square implements Figure {
    private String position;
    private FigurePrefab figurePrefab;

    public Square(FigurePrefab figurePrefab) {
        this.position = getPosition();
        this.figurePrefab = figurePrefab;
    }

    @Override
    public String toString() {
        return "Square{" +
                "position='" + position + '\'' +
                ", figurePrefab=" + figurePrefab +
                '}';
    }

    private String getPosition(){
        return "X: " + (Math.random() * 100)  + ", Y: " + (Math.random() * 100);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void show() {
        System.out.println(this);
    }
}
