package chapter12_ExceptionHandlingAndTextIO.latihan;

import java.io.StringReader;

public class Listing12_11_TestCirleWithCustomException {
    public static void main(String[] args) {
        try {
            new Listing12_11_TestCirleWithCustomException(5);
            new Listing12_11_TestCirleWithCustomException(-5);
            new Listing12_11_TestCirleWithCustomException(0);
        }
        catch (Listing12_10_InvalidRadiusException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of objects created: +" +
                CircleWithCustomException.getNumberOfObject());
    }
}

class CircleWithCustomException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithCustomException(double newRadius)
        throws Listing12_10_InvalidRadiusException {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return  radius;
    }

    public void setRadius(double newRadius)
        throws Listing12_10_InvalidRadiusException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new Listing12_10_InvalidRadiusException(newRadius);
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findArea() {
        return radius * radius * 3.14159;
    }
}


