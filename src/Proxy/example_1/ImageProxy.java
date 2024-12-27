package Proxy.example_1;

public class ImageProxy implements Image {
    private String pathName;
    private RealImage realImage;
    private User user;

    public ImageProxy(String pathName, User user) {
        this.pathName = pathName;
        this.user = user;
    }

    @Override
    public void showImage() {
        if( user == null || !user.isAuth() ){
            System.out.println("Access Denied. The user is not authenticated");
            return;
        }

        if( realImage == null ){
            realImage = new RealImage(pathName);
        }

        realImage.showImage();
    }
}
