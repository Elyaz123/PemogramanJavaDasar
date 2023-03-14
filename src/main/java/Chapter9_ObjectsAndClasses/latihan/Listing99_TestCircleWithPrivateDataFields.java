package Chapter9_ObjectsAndClasses.latihan;

public class Listing99_TestCircleWithPrivateDataFields {
    public static void main(String[] args) {

        Circle myCircle = new Circle(5.0);
        System.out.println("The area of the circle of radius "
        + myCircle.setRadius() + " is " + myCircle.getArea());

        myCircle.setRadius(myCircle.setRadius() * 1.1);
        System.out.println("The area of the circle of radius "
        myCircle.setRadius() + " is " + myCircle.getArea());

        System.out.println("The number of objects created is "
        + Circle.NumberOfObjects());
    }
}
