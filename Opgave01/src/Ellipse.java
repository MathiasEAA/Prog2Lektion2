public class Ellipse extends Circle {

    private int radius;

    public Ellipse(int x, int y, int radius, int radiusB) {
        super(x, y, radius);
        this.radius = radiusB;
    }

    public double getArea() {
        return Math.PI * radius * super.radius;
    }
}
