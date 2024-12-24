package example_8;

public class AFKState implements CharacterState {
    @Override
    public void move(Character character) {
        System.out.println("El personaje " + character.getName() + " se está moviendo.");
        character.setCharacterState(new OnMoveState());
    }

    @Override
    public void attack(Character character) {
        System.out.println("El personaje " + character.getName() +  " empezó a atacar.");
        character.setCharacterState(new AttackingState());
    }

    @Override
    public void receiveDamage(Character character) {
        System.out.println("El personaje " + character.getName() + " esta recibiendo daño");
        character.setCharacterState(new WoundedState());
    }

    @Override
    public void showState() {
        System.out.println("El personaje esta AFK");
    }
}
