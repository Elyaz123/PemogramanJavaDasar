package chapter6_Methodes.exercises;

import java.util.Scanner;

public class Exercises63PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int number = input.nextInt();

        System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
                "a palindrome.");
    }
    public static boolean isPalindrome(int number) {
        return number == reserve(number) ? true : false;
    }
    public static int reserve(int number) {
        String reserve = "";
        String n = number + "";

        for (int i = n.length() - 1; i >= 0; i--) {
            reserve += n.charAt(i);
        }
        return Integer.parseInt(reserve);
    }
}
