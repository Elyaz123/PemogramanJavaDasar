package chapter5_loop.exercise;

public class Exercises53ConversionFromKillogramToPound {
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2;

        //Display header for table
        System.out.println(" Kilograms     Pounds");

        //Display table
        for (int i = 1; i <= 199; i += 2) {
            System.out.printf(
                    "%-15d%6.1f\n" , i, (i * POUNDS_PER_KILOGRAM));
        }
    }
}
