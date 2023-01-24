package chapter5_loop.latihan;

import java.util.Scanner;

public class Listing514Palindrome {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // The index of a character in a string
        int low = 0;

        //The index of the last charcter in the string
        int high = s.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome)
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}
