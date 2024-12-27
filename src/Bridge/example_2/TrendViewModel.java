package Bridge.example_2;

import Bridge.example_2.model.Trend;

public class TrendViewModel implements IViewModel {
    private Trend trend;

    public TrendViewModel(Trend trend) {
        this.trend = trend;
    }

    @Override
    public String title() {
        return "Trend -> " + trend.getTitle() + ", tiene " + trend.getFavorites() + " reacciones.";
    }

    @Override
    public String image() {
        return "Trend -> " + trend.getImage();
    }
}
