package example_3;

public class WithThumbnailListItemView extends ListItemView {
    public WithThumbnailListItemView(IViewModel iViewModel) {
        super(iViewModel);
    }

    @Override
    void render() {
        System.out.println("----------------------------------------------------");
        System.out.println("Here render amazing thumbnail: " + iViewModel.image());
        System.out.println(iViewModel.title());
        System.out.println("----------------------------------------------------");
    }
}
