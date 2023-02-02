package chapter5_loop.exercise;

import java.util.Scanner;

public class Exercises538DecimalToOctal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        String octal = "";
        for (int i = decimal; i > 0; i /= 8) {
            octal = i % 8 + octal;
        }
        System.out.println("The octal of " + decimal + " is " + octal);
    }
}
