package geometry;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.12,5.43);
        System.out.println(rectangle.getArea());

        Triangle triangle = new Triangle (3.18, 6.19);
        System.out.println(triangle.getArea());

        Circle circle = new Circle(23.12);
        System.out.println(circle.getArea());
    }

}
