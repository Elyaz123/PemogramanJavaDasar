package chapter5_loop.exercise;

public class Exercises512FindThesmallestNsuchThatN212000 {
    public static void main(String[] args) {
        int n = 0;

        while (Math.pow(n, 2) < 12000) {
            n++;
        }
        System.out.println("The smallest integer n such that n^2 is grater than 12,000: " + n);
    }
}
