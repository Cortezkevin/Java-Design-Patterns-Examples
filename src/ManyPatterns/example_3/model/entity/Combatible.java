package ManyPatterns.example_3.model.entity;

public interface Combatible {
    Integer damage();
    Integer health();
    String mobility();
    String combatType();
    String combatibleName();

    void decreaseHealth(Integer damage);
}
