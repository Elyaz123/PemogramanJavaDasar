package chapter11_InheritanceAndPolymorphism.latihan;

public class Listing11_4_TestCircleRectangle {
    public static void main(String[] args) {
        Listing11_2_Circle circle = new Listing11_2_Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Listing11_3_Rectangle rectangle = new Listing11_3_Rectangle(2, 4);
        System.out.println("\nA Rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
