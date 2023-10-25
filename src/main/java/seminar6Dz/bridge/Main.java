package seminar6Dz.bridge;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(new VectorRenderer(), 5);
        shape1.draw();
        shape1.resize(2);
        shape1.draw();

        Shape shape2 = new Circle(new RasterRenderer(), 10);
        shape2.draw();
    }
}
