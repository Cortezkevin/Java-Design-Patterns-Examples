package Flyweight.example_2;

import java.util.HashMap;

public class FigurePrefabFactory {
    private static HashMap<String, FigurePrefab> prefabs = new HashMap<>();

    public static FigurePrefab getFigurePrefab(FigurePrefab figurePrefab) {
        String prefabKey = figurePrefab.getId() +"_"+ figurePrefab.getColor();
        if(!prefabs.containsKey(prefabKey)){
            prefabs.put(prefabKey, figurePrefab);
        }

        return prefabs.get(prefabKey);
    }
}
