package chapter10_ObjectOrientedThinking.exercises;

public class Exercises10_11_TheCircle2DClass {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("Circle1 area: " + c1.getArea());
        System.out.println("Circle1 perimeter: " + c1.getPerimeter());
        System.out.println(
                "Does circle1 contain the point (3, 3)? " + c1.contains(3, 3));
        System.out.println(
                "Does circle1 contain the circle centered at (4, 5) and radius 10.5?"
                + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(
                "Does circle1 contain the circle centered at (3, 5) and radius 2.5?"
                + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class Circle2D {

    private double x;
    private double y;
    private double radius;

    Circle2D() {
        this(0, 0, 1);
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) +
                Math.pow(y - this.y, 2))
                < radius;
    }

    public boolean contains(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) +
                Math.pow(circle.getY() - y, 2))
                <= Math.abs(radius - circle.getRadius());
    }

    public boolean overlaps(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) +
                Math.pow(circle.getY() - y, 2))
                <= radius + circle.getRadius();
    }
}
