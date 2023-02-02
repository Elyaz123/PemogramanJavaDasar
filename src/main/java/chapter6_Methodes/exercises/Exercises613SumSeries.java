package chapter6_Methodes.exercises;

public class Exercises613SumSeries {
    public static void main(String[] args) {
        double seriesStart  =  1.0;
        double numberOfRows = 20.0;

        // Display header
        System.out.println("\ni        m(i)     ");
        System.out.println("-------------------");

        // Display Data
        for (double i = seriesStart; i <= numberOfRows; i++) {
            System.out.printf("%-10.0f", i);
            System.out.printf("%7.4f\n", sumSeries(i));
        }
    }

    public static double sumSeries(double n) {
        double sum = 0;	// Sum of the series
        for (double i = 1; i <= n; i++) {
            sum += i / (i + 1);
        }
        return sum;
    }
}
