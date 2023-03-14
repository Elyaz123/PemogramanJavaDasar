package Chapter9_ObjectsAndClasses.latihan;



import java.awt.geom.Point2D;
import java.util.Scanner;

public class Listing95_TestPoint2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point1 x-, y-coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point1 x-, y-coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        Point2D p1 = new Point2D() {
            @Override
            public double getX() {
                return 0;
            }

            @Override
            public double getY() {
                return 0;
            }

            @Override
            public void setLocation(double x, double y) {

            }
        };
        Point2D p2 = new Point2D() {
            @Override
            public double getX() {
                return 0;
            }

            @Override
            public double getY() {
                return 0;
            }

            @Override
            public void setLocation(double x, double y) {

            }
        };
        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());
        System.out.println("The distance between p1 and p2 is " +
                p1.distance(p2));
        System.out.println("The midpoint between p1 and p2 is " +
                p1.midpoint(p2).toString());


    }
}
