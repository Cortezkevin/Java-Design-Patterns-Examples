package State.example_1;

public class WoundedState implements CharacterState {
    @Override
    public void move(Character character) {
        System.out.println("El personaje " + character.getName() + " esta herido, no puede moverse.");
    }

    @Override
    public void attack(Character character) {
        System.out.println("El personaje " + character.getName() + " esta herido, no puede atacar.");
    }

    @Override
    public void receiveDamage(Character character) {
        if(Math.random() > 0.5){
            System.out.println("El personaje " + character.getName() + " esta herido, pero recibe mas daño.");
        }else {
            System.out.println("El personaje " + character.getName() + " ya no soporto mas daño y murio");
            character.setCharacterState(new DiedState());
        }

    }

    @Override
    public void showState() {
        System.out.println("El personaje esta herido.");
    }
}
