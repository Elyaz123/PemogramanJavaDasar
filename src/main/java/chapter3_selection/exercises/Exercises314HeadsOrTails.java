package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises314HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate a random integer 0 or 1
        int coin = (int)(Math.random() * 2);

        // Prompt the user to enter guess
        System.out.print(" Enter a guess 0-heard to 1-tail: ");
        int guess = input.nextInt();

        // Display result
        System.out.println(((guess == coin) ? "correct" : "Incorrect.") + " guess.");
    }
}
