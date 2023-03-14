package chapter12_ExceptionHandlingAndTextIO.latihan;

public class Listing12_8_TestCircleWithException {
    public static void main(String[] args) {
        try {
            Listing12_7_CircleWithException c1 = new Listing12_7_CircleWithException(5);
            Listing12_7_CircleWithException c2 = new Listing12_7_CircleWithException(-5);
            Listing12_7_CircleWithException c3 = new Listing12_7_CircleWithException(0);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        System.out.println("Number of object created: " +
                Listing12_7_CircleWithException.getNumberOfObjects());
    }
}
