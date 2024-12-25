package example_12;

public class FigureFactory {
    public static Figure createCircle(FigurePrefab figurePrefab){
        return new Circle(FigurePrefabFactory.getFigurePrefab(figurePrefab));
    }

    public static Figure createSquare(FigurePrefab figurePrefab){
        return new Square(FigurePrefabFactory.getFigurePrefab(figurePrefab));
    }
}
