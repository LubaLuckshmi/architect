package seminar6Dz.proxy;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        image1.display();

        Image image2 = new ProxyImage("image2.jpg");
        image2.display();

        Image image3 = new ProxyImage("image1.jpg");
        image3.display();
    }
}
