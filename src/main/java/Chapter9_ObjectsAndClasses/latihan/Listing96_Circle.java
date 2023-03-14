package Chapter9_ObjectsAndClasses.latihan;

public class Listing96_Circle {
    double radius;

    static int numberOfObjects = 0;

    void Circle() {
        radius = 1;
        numberOfObjects++;
    }

    void Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return  numberOfObjects;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}
