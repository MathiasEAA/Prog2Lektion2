
public class Storage {

    public static void main(String[] args) {
        Circle circle = new Circle(100,50,25);
        Ellipse ellipse = new Ellipse(100,100,10,20);
        Square square = new Square(25,25,10);
        Rectangle rectangle = new Rectangle(50,50,20,10);

        circle.move(50,100);
        System.out.println("Circle x,y, expecting x: 150, y: 150");
        System.out.println("Circle area (expect 1963.495): " + circle.getArea());
        System.out.println(circle.getX() + "," + circle.getY());
        System.out.println("Ellipse area (expect 628.318): " + ellipse.getArea());
        System.out.println("Square area (expect 100): " + square.getArea());
        System.out.println("Rectangle area (expect 200): " + rectangle.getArea());

    }
}
