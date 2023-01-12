package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises326UseOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner Object

        //Prompt the user to an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Determine whether it is divisible by 5 and 6
        // Display result
        System.out.println("IS 10 divisible by 5 and 6? " + ((number % 5 == 0) &&  (number % 6 == 0)));
        System.out.println("Is 10 divisible by 5 or 6? " + ((number % 5 == 0) || (number % 6 == 0)));
        System.out.println("Is 10 divisible bye 5 of 6, but not both? " + ((number % 5 == 0) ^ (number % 6 == 0)));

    }
}
