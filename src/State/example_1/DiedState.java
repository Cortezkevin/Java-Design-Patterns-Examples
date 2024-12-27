package State.example_1;

public class DiedState implements CharacterState {
    @Override
    public void move(Character character) {
        System.out.println("El personaje " + character.getName() + " esta muerto, no puede moverse");
    }

    @Override
    public void attack(Character character) {
        System.out.println("El personaje " + character.getName() + " esta muerto, no puede atacar");
    }

    @Override
    public void receiveDamage(Character character) {
        System.out.println("El personaje " + character.getName() + " esta muerto, no puede recibir mas daño");
    }

    @Override
    public void showState() {
        System.out.println("El personaje esta muerto");
    }
}
