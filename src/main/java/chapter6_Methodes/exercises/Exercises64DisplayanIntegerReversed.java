package chapter6_Methodes.exercises;

import java.util.Scanner;

public class Exercises64DisplayanIntegerReversed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Display and Integer reversed: ");

        System.out.print("Enter an Integer: ");
        int number = input.nextInt();

        reverse(number);
    }
    public static void reverse(int number) {
        while (number > 0) {
            System.out.print((number % 10));
            number /= 10;
        }
        System.out.println();
    }
}
