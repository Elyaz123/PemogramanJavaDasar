package chapter6_Methodes.exercises;

import java.util.Scanner;

public class Exercises620CountTheLettersInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();


        System.out.println(
                "The number of letters in the string \"" +
                        string + "\": " + countLetters(string));
    }
    public static int countLetters(String s) {
        int numberOfLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            // Test if character is a letter
            if (Character.isLetter(s.charAt(i)))
                numberOfLetters++;
        }
        return numberOfLetters;

    }
}
