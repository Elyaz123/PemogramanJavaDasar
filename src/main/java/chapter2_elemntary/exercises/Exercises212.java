package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises212 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create new Scanner object.

        // Prompt user to enter the airplane's acceleration a and take-off speed v.
        System.out.print("enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        // Compute the minimum runaway leght
        // needed for an airplane to take off.
        double lenght = Math.pow(speed, 2) / (2 * acceleration);

        // Dislplay result
        System.out.println(
                "The minimum runway lenght for  this " +
                        " airpalne is " + lenght);
    }
}
