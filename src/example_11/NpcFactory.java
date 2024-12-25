package example_11;

import example_11.assets.AssetsPrefab;
import example_11.assets.Prefab;

public class NpcFactory {
    public static Npc createNpc(Prefab prefab){
        Prefab prefabNew = AssetsPrefab.getPrefab(prefab);
        Npc npc = new Npc(prefabNew);
        return npc;
    }
}
