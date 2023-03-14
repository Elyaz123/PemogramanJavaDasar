package chapter12_ExceptionHandlingAndTextIO.latihan;

public class Listing12_10_InvalidRadiusException {
    private double radius;

    public Listing12_10_InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
