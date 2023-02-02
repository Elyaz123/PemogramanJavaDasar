package chapter5_loop.exercise;

public class Exercises55ConversionFromKilogramToPundsToKilograms {
    public static void main(String[] args) {
        // Create constant valur for number of punds per kilogram
        final double POUNDS_per_KILOGRAM = 2.2;

        //Display table header
        System.out.println("Kilograms   Pounds   |   Pounds    Kilogram");
        for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
            System.out.printf("%-12d%7.1f", k, (k * POUNDS_per_KILOGRAM));
            System.out.print("   |   ");
            System.out.printf("%-9d%12.2f\n",
                    p, (p / POUNDS_per_KILOGRAM));
        }
    }
}
