public class Square extends Shape{

    double length;

    public Square(int x, int y, int length) {
        super(x, y);
        this.length = length;
    }

    public double getArea() {
        return length * length;
    }
}
