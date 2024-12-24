package example_8;

public class AttackingState implements CharacterState {
    @Override
    public void move(Character character) {
        System.out.println("El personaje " + character.getName() + " deja de atacar y se empieza a mover");
        character.setCharacterState(new OnMoveState());
    }

    @Override
    public void attack(Character character) {
        System.out.println("El personaje " + character.getName() + " esta atacando");
    }

    @Override
    public void receiveDamage(Character character) {
        System.out.println("El personaje " + character.getName() + " recibe daño mientras ataca");
    }

    @Override
    public void showState() {
        System.out.println("El personaje esta atacando");
    }
}
