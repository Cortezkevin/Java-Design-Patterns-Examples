package Proxy.example_1;

public class RunApp {
    public static void main(String[] args) {
        User user1 = new User("Kevin",true);
        ImageProxy imageProxy = new ImageProxy("D://downloads/image.png", user1);

        imageProxy.showImage();
        imageProxy.showImage();
    }
}
