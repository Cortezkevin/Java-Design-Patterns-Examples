package example_8;

public interface CharacterState {
    void move(Character character);
    void attack(Character character);
    void receiveDamage(Character character);

    void showState();
}