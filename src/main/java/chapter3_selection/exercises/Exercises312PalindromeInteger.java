package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises312PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three digit integer: ");
        int number = input.nextInt();

        int digit1 = (int)(number / 100);
        int remaining = number % 100;
        int digit3 = (int)(remaining % 10);

        System.out.println(number + ((digit1 == digit3) ? " is a " : " is not a ") + "palindrome");
    }
    }

