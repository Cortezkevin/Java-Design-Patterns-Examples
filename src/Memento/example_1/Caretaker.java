package Memento.example_1;

import javax.naming.NameNotFoundException;
import java.util.HashMap;

public class Caretaker {
    static HashMap<String, Memento> games = new HashMap<>();

    public Caretaker() {
    }

    public static void save(Memento memento){
        if( games.containsKey(memento.getGameName()) )
            System.out.println("Sobreescribiendo partida..." + memento.getGameName());
        games.put(memento.getGameName(), memento);
    }

    public static Memento load(String gameName) throws NameNotFoundException {
        if( !games.containsKey(gameName) ){
            System.out.println("No existe una partida con ese nombre.");
            throw new NameNotFoundException("Nombre de partida no encontrado");
        }

        return games.get(gameName);
    }
}
