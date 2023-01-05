package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises22 {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and lenght Cylinder: ");
        double radius = input.nextDouble();
        double lenght = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * lenght;

        System.out.println("The area is " + area + "\nThe volume is " + volume );

    }
}
