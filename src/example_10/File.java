package example_10;

/*
* TODO: Componente concreto que representa una hoja del árbol, no puede contener hijos
*/
public class File extends Component {
    public File(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("El archivo no puede contener otros componentes");
    }

    @Override
    public void remove(Component component) {
        System.out.println("El archivo no puede contener otros componentes");
    }

    @Override
    public void showChildren() {
        System.out.println("\t".repeat(indent) + name);
    }
}
