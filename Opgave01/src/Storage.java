
public class Storage {

    public static void main(String[] args) {
        Circle circle = new Circle(100,50,25);
        Ellipse ellipse = new Ellipse(100,100,10,20);
        Square square = new Square(25,25,10);
        Rectangle rectangle = new Rectangle(50,50,20,20);

        System.out.println("Expect 1963.5 ish: " + circle.getArea());
    }
}
