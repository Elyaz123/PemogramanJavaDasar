package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises33Solve2x2LinearEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a, b, c, d, e and  f.
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        double d = input.nextInt();
        double e = input.nextInt();
        double f = input.nextInt();

        // Solve the linier equation
        if (a * d - b * c == 0)
            System.out.println("The equation has no solution.");
        else
        {
            double x =(e * d - b * f) / (a * d - b * c );
            double y =(a * f - e * c) / (a * d - b * c );
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
