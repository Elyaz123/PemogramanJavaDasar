package Chapter9_ObjectsAndClasses.latihan;

public class Listing910_TestPassObject {
    public static void main(String[] args) {

        Circle myCircle = new Circle(1);

        int n = 5;
        printAreas(myCircle, n);

        System.out.println("\n" + "Radius is " + myCircle.setRadius());
        System.out.println("n is " + n);
    }

    public static void printAreas(Circle c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.setRadius() + "\t\t" + c.getArea());
            c.setRadius(c.setRadius() + 1);
            times--;
        }
    }
}
