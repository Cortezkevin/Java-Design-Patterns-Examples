package State.example_1;

public class Character {
    private CharacterState characterState;
    private String name;

    public Character(String name) {
        this.characterState = new AFKState();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacterState(CharacterState characterState) {
        this.characterState = characterState;
    }

    public CharacterState getCharacterState() {
        return characterState;
    }

    public void move(){
        this.characterState.move(this);
    }

    public void receiveDamage(){
        this.characterState.receiveDamage(this);
    }

    public void attack(){
        this.characterState.attack(this);
    }

    public void showState(){
        this.characterState.showState();
    }
}
