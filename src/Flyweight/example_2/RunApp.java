package Flyweight.example_2;

/*
 * TODO -> App Example using FlyWeight design pattern
 */
public class RunApp {
    public static void main(String[] args) {
        FigurePrefab figurePrefab1 = new FigurePrefab("verde",10);
        FigurePrefab figurePrefab2 = new FigurePrefab("rojo",25);

        Figure figura1 = FigureFactory.createSquare(figurePrefab1);
        Figure figura2 = FigureFactory.createCircle(figurePrefab2);
        Figure figura3 = FigureFactory.createCircle(figurePrefab1);
        Figure figura4 = FigureFactory.createCircle(figurePrefab1);

        figura1.show();
        figura2.show();
        figura3.show();
        figura4.show();
    }
}
