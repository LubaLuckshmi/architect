package seminar6Dz.bridge;
interface IRenderer {
    void renderCircle(float radius);
}

class VectorRenderer implements IRenderer {
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius " + radius + " using vector renderer");
    }
}

class RasterRenderer implements IRenderer {
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius " + radius + " using raster renderer");
    }
}

abstract class Shape {
    protected IRenderer renderer;

    public Shape(IRenderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
    public abstract void resize(float factor);
}

class Circle extends Shape {
    private float radius;

    public Circle(IRenderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    public void draw() {
        renderer.renderCircle(radius);
    }

    public void resize(float factor) {
        radius *= factor;
    }
}

