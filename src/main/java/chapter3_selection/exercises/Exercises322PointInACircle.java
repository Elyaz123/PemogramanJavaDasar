package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises322PointInACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the point
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Check whether the point is withuin the circle
        boolean withinCircle = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

        // Display result
        System.out.println("Point (" + x + ", " + y + ") is " + ((withinCircle) ? "in " : "not in") + "the circle");
    }
}
