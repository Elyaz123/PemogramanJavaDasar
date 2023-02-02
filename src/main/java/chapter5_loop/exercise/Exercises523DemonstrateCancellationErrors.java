package chapter5_loop.exercise;

public class Exercises523DemonstrateCancellationErrors {
    public static void main(String[] args) {
        double sum = 0.0;
        for (double i = 1.0; i <= 50000.0; i++) {
            sum += 1 / i;
        }
        System.out.println("Summation of series left to right: " + sum);

        for (double i = 50000.0; i >= 1.0; i--) {
            sum += 1 / i;
        }
        System.out.println("Summation of series right to left: " + sum);
    }
}
