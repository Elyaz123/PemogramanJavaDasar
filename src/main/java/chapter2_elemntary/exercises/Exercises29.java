package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the starting velocity v0 in metres/second.
        // the ending cvelocity v1 in meters/second, and the time span t in seconds.
        System.out.print("Enter v0, v1 and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        // Calculate the Average acceleration
        double a =  (v1 - v0) / t;

        // Display result
        System.out.println("The average acceleration is " + a);
    }
}
