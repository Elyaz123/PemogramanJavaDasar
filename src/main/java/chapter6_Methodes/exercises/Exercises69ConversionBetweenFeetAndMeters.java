package chapter6_Methodes.exercises;

public class Exercises69ConversionBetweenFeetAndMeters {
    public static void main(String[] args) {
        System.out.println(
                "\nFeet   Meters   |   Meters   Feet\n" +
                "--------------------------------------");
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5) {
            System.out.printf("%4.1f    ", feet);
            System.out.printf("6.3f", footToMeter(feet));
            System.out.printf("    |     ");
            System.out.printf("%-11.1f", meters);
            System.out.printf("%7.3f\n", meterToFoot(meters));
        }
    }
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    public static  double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
