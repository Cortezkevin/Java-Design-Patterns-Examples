package example_3;

import example_3.model.Stream;

public class StreamViewModel implements IViewModel {
    private Stream stream;

    public StreamViewModel(Stream stream) {
        this.stream = stream;
    }

    @Override
    public String title() {
        return "STREAM -> " + stream.getTitle() + ", Currently Viewing " + stream.getViewers();
    }

    @Override
    public String image() {
        return "STREAM -> " + stream.getImage();
    }
}
