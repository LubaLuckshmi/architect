package seminar6Dz.flyweight;


import seminar3Dz.Ocp.Shape;

class Circle implements IShape, Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing circle with color " + color + ", x: " + x + ", y: " + y + ", radius: " + radius);
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}

