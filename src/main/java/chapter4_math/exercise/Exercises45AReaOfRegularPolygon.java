package chapter4_math.exercise;

import java.util.Scanner;

public class Exercises45AReaOfRegularPolygon {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //prompt the user to enter the number of the sides
        // and their length of s regular polygon
        System.out.print("Enter the number of the side; ");
        int numberOfSide = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Compute the area of a regular polygon
        double area = (numberOfSide * Math.pow(side, 2) / (4 * Math.tan(Math.PI / numberOfSide)));

        //display result
        System.out.println("The area of the polygon is " + area);
    }
}
