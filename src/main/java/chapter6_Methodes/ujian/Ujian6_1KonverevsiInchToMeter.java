package chapter6_Methodes.ujian;

public class Ujian6_1KonverevsiInchToMeter {
    public static void main(String[] args) {
        System.out.println("\nInch      Meters      |      Meters      Inch\n" +
                "-------------------------------------------------");

        for (double inch = 1.0, meters = 1.0; inch <= 100.0; inch++, meters += 1) {
            System.out.printf("%4.1f      ", inch);
            System.out.printf("%6.3f", inchToMeters(inch));
            System.out.print("      |      ");
            System.out.printf("%-11.1f", meters);
            System.out.printf("%7.3f\n", meterToInch(meters));
        }
    }

    public static double inchToMeters(double inch) {
        return 0.0254 * inch;
    }

    public static double meterToInch(double meters) {
        return 39.3701 * meters;
    }

}



