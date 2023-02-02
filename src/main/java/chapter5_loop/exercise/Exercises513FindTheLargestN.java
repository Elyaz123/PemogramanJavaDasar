package chapter5_loop.exercise;

public class Exercises513FindTheLargestN {
    public static void main(String[] args) {
        int n = 0;

        // Find the largest n such that n^3 is 12,000
        while (Math.pow(n + 1, 3) < 12000) {
            n++;
        }
        System.out.println("Largest integer n such that n^3 is less than 12,000: " + n);
    }
}
