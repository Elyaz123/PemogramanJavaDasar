package chapter5_loop.exercise;

import java.util.Scanner;

public class Exercises537DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal integer: ");
        int decimal = input.nextInt();

        String bianry = "";
        for (int i = decimal; i > 0; i /= 2) {
            bianry = (i % 2) + bianry;
        }
        System.out.println(
                "The binary value of the decimal\"" + decimal + "\" is: " + bianry);
    }
}
