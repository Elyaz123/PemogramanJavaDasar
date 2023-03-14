package Chapter9_ObjectsAndClasses.exercises;

import java.util.Scanner;

public class Exercises911_Algebra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation LinearEquation = new LinearEquation(a, b, c, d, e, f);

        if (LinearEquation.isSolvable()) {
            System.out.println("x is " + LinearEquation.getX() +
                    " and y is " + LinearEquation.getY());
        }
        else
            System.out.println("The equation has the solution.");
    }
}

