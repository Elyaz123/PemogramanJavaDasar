package chapter5_loop.exercise;

public class Exercises526ComputeE {
    public static void main(String[] args) {
        double e = 0.0,
        value = 10000.0;
        // Compute e value for i = 10000
        for ( double i = 1; i <= value; i++) {
            double denominator = i;
            for (double k = i - 1; k >= 1; k--) {
                denominator *= k;
            }
            e += 1 / denominator;
        }
        // Display result
        System.out.println("The e value for i = 10000: " + e);
        //Compute e value for i = 20000
        e = 0.0;
        for (double i = 1; i <= value; i++) {
            double denominator = i;
            for (double k = i - 1; k >= 1; k--) {
                denominator *= k;
            }
            e += 1 / denominator;
        }
        // display result
        System.out.println("The e value for i = 20000: " + e);
    }
}
