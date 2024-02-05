public class Circle extends Shape{

    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
