package chapter11_InheritanceAndPolymorphism.latihan;

public class Listing11_7_CastingDemo {
    public static void main(String[] args) {
        Object object1 = new Listing11_2_Circle(1);
        Object object2 = new Listing11_3_Rectangle(1, 1);

        displayObject(object1);
        displayObject(object2);
    }
    public static void displayObject(Object object) {
        if (object instanceof Listing11_2_Circle) {
            System.out.println("The circle area is " +
                    ((Listing11_2_Circle) object).getArea());
            System.out.println("The circle diameter is " +
                    ((Listing11_2_Circle) object).getDiameter());
        } else if (object instanceof Listing11_3_Rectangle) {
            System.out.println("The rectangle area is " +
                    ((Listing11_3_Rectangle)object).getArea());
        }
    }
}
