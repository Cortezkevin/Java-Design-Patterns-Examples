package State.example_1;

public class OnMoveState implements CharacterState {
    @Override
    public void move(Character character) {
        System.out.println("El personaje " + character.getName() + " se esta moviendo");
    }

    @Override
    public void attack(Character character) {
        System.out.println("El personaje " + character.getName() + " se detiene y empieza a atacar");
        character.setCharacterState(new AttackingState());
    }

    @Override
    public void receiveDamage(Character character) {
        System.out.println("El personaje " + character.getName() + " recibe daño y es herido");
        character.setCharacterState(new WoundedState());
    }

    @Override
    public void showState() {
        System.out.println("El personaje esta en movimiento");
    }
}
