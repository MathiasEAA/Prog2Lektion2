public class Rectangle extends Square {

    private double length;

    public Rectangle(int x, int y, int length, int lengthB) {
        super(x, y, length);
        this.length = lengthB;
    }

    public double getArea() {
        return super.length * this.length;
    }
}
