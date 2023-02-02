package chapter5_loop.exercise;

public class Exercises525ComputeP {
    public static void main(String[] args) {
        double sum = 0;
        double value = 10000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        double pi = 4 * sum;

        // Display result
        System.out.println("PI value for i = 10000: " + pi);

        // Compute PI value for i = 20000,
        sum = 0;
        value = 20000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 /d;
            d += 2;
            sum -= 1 / d;
        }
        pi = 4 * sum;

        // Display result
        System.out.println("PI value for i = 20000: " + pi);

        // Compute PI value for  i = 20000,
        sum = 0;
        value = 100000.0;
        for ( double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
        }
        pi = 4 * sum;

        // Display result
        System.out.println("Pi value for i = 100000: " + pi);
    }
}
