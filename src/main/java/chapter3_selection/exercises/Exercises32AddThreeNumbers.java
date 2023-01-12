package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises32AddThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate three random integers
        int digital1 = (int)(Math.random() * 10);
        int digital2 = (int)(Math.random() * 10);
        int digital3 = (int)(Math.random() * 10);

        // Prompt user to enter the sum of the three integers
        System.out.print("What is " + digital1 + " + " + digital2 + " + " + digital3 + "? ");
        int answer = input.nextInt();

        System.out.println(digital1 + " + " + digital2 + " + " + digital3 + " = " + answer + " is " + (digital1 + digital2
                + digital3 == answer));
    }
}
