package chapter5_loop.exercise;

public class Exercises54ConversionFromKilogramToPounds {
    public static void main(String[] args) {
        final  double KILOMETERS_PER_MILE = 2.2;

        // Display header for table
        System.out.println(
                "Miles     Kilometers");

        // Create and display table showing convesion from miles to kilometers
        for (int i = 1; i <= 10; i++) {
            System.out.printf(
                    "%-13d-10.3f\n", i, (i * KILOMETERS_PER_MILE));
        }
    }
}
