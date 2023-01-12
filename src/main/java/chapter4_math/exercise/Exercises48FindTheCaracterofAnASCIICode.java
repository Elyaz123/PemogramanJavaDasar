package chapter4_math.exercise;

import java.util.Scanner;

public class Exercises48FindTheCaracterofAnASCIICode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter an ASCII code
        //(an integer between 0-127)
        System.out.print("Enter an ASCII code: ");
        int i = input.nextInt();

        // Display ASCII code as character
        System.out.println((char)i);
    }
}
