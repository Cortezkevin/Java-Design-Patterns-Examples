package Bridge.example_2;

public class JustTextListItemView extends ListItemView {
    public JustTextListItemView(IViewModel iViewModel) {
        super(iViewModel);
    }

    @Override
    void render() {
        System.out.println("----------------------------------------------------");
        System.out.println("Just render title: " + iViewModel.title());
        System.out.println("----------------------------------------------------");
    }
}
