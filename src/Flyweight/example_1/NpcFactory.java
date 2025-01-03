package Flyweight.example_1;

import Flyweight.example_1.assets.AssetsPrefab;
import Flyweight.example_1.assets.Prefab;

public class NpcFactory {
    public static Npc createNpc(Prefab prefab){
        Prefab prefabNew = AssetsPrefab.getPrefab(prefab);
        Npc npc = new Npc(prefabNew);
        return npc;
    }
}
