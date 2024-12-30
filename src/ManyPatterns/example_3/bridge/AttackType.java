package ManyPatterns.example_3.bridge;

import ManyPatterns.example_3.model.entity.Entity;

public interface AttackType {
    void attack(Entity target);
    String name();
}
