package chapter4_math.exercise;

import java.util.Scanner;

public class Exercises422CheckSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter two strings
        System.out.print("Enter string s1: ");
        String string1 = input.nextLine();
        System.out.print("Enter String s2: ");
        String string2 = input.nextLine();

        //display wheater the second string
        // is a subtrstring of the first string
        System.out.println(string2 + ((string1.contains(string2)) ? " is " : " is not ") + "a substring of " + string1);
    }
}
