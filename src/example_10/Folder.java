package example_10;

import java.util.ArrayList;
import java.util.List;

/*
 * TODO: Componente concreto que representa un nodo del árbol, puede contener hijos
 */
public class Folder extends Component {
    private List<Component> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {

        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void showChildren() {
        System.out.println("\t".repeat(indent) + name);

        for (Component component: children){
            component.increaseIndent(indent);
            component.showChildren();
        }
    }
}
