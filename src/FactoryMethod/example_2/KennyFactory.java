package FactoryMethod.example_2;

public class KennyFactory extends SouthParkFactory{
    @Override
    public SouthParkCharacter createCharacter() {
        return new Kenny();
    }
}
