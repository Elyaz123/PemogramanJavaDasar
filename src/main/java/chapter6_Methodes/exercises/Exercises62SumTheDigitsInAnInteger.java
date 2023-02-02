package chapter6_Methodes.exercises;

import java.util.Scanner;

public class Exercises62SumTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter an Integer: ");
        long number = input.nextLong();

        System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
    }
    public static long sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
