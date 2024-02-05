public abstract class Shape {

    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public abstract double getArea();

    public String getX() {
        return "x: " +  x;
    }

    public String getY() {
        return "y: " + y;
    }
}
