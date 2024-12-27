package Flyweight.example_1.assets;

import java.util.HashMap;

public class AssetsPrefab {
    private static HashMap<Integer, Prefab> prefabs = new HashMap<>();

    public static Prefab getPrefab(Prefab prefab){
        int id = prefab.getId();
        if(!prefabs.containsKey(id)){
            prefabs.put(id, prefab);
        }
        return prefabs.get(id);
    }
}
