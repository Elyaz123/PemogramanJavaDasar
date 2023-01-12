package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises323PointInARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a point (x, y)
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Check whether the point is withuin the rectangle
        // centered at (0, 0) with widht 10 ang height 5
        boolean withinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2));

        // Display result
        System.out.println("Point (" + x + ", " + y + ") is " + ((withinRectangle) ? "in " : "not in") + "the rectangle");
    }
}





