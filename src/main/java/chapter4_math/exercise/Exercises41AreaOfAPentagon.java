package chapter4_math.exercise;

import java.util.Scanner;

public class Exercises41AreaOfAPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the lenght from
        // the center of pentagon to a vertex
        System.out.print("Enter the lenght from the center to a vertex:");
        double r = input.nextDouble();

        // compute the area of the pentagon
        double s = (2 * r) * Math.sin(Math.PI / 5); //lenght of a side
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        //display result
        System.out.printf("The area of the pentagon is %5.2f\n", area);
    }
}
