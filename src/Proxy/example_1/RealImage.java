package Proxy.example_1;

public class RealImage implements Image {
    private String pathName;

    public RealImage(String pathName) {
        this.pathName = pathName;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Cargando la imagen " + pathName + " desde el disco...");
    }

    @Override
    public void showImage() {
        System.out.println("Mostrando imagen: " + pathName );
    }
}
