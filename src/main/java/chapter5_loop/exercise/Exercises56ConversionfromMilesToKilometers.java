package chapter5_loop.exercise;

public class Exercises56ConversionfromMilesToKilometers {
    public static void main(String[] args) {
        // Create constant value: number ofo kilometers per mile
        final double KILOMETERS_PER_MIE = 1.609;

        // display table header
        System.out.println("Miles     Kilomeeters   |   Kilometers     Miles    ");

        //Create and dispaly tables
        for (int m = 1, k = 20; m <= 10 && k <= 65; m++, k += 5)  {
            System.out.printf("%-11d%-10.3f", m, (m * KILOMETERS_PER_MIE));
            System.out.print("    |     ");
            System.out.printf("5-15d-6.3f\n", k, (k / KILOMETERS_PER_MIE));
        }
    }
}
