package example_10;

/*
* TODO: Clase base o interfaz que define un tipo común entre los objetos, con métodos para agregar (add), remover (remove) y mostrar a los hijos (showChildren)
*/
public abstract class Component {
    protected String name;
    protected Integer indent = 0;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);

    public String getName(){
        return name;
    }

    public Integer getIndent(){
        return indent;
    }

    public void increaseIndent(Integer lastIndent){
        indent = lastIndent + 1;
    }

    public abstract void showChildren();
}
