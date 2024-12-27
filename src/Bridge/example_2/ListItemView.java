package Bridge.example_2;

public abstract class ListItemView {
    protected IViewModel iViewModel;

    public ListItemView(IViewModel iViewModel) {
        this.iViewModel = iViewModel;
    }

    abstract void render();
}
