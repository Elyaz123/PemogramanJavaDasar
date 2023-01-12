package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises31AlgebraSolveQuadraticEquation {
    public static void main(String[] args) {
        // create a Scanner object
       Scanner input = new Scanner(System.in);

        //Prompt the user to enter values for a, b and c
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input. nextDouble();

        // Compute the discriminant of the quardriatic equation.
        double discriminant = Math.pow(b,2) - 4 * a * c;

        // Compute the real roots of the quardriatic equation if any.
        System.out.print("The equation has ");
        if (discriminant > 0)
        {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("two roots " + root1 + " and " + root2);
        }
        else if (discriminant == 0)
        {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("one root " + root1);
        }
        else
            System.out.println("no real roots");
    }
}
