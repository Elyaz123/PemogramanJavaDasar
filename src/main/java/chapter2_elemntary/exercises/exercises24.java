package chapter2_elemntary.exercises;

import java.util.Scanner;

public class exercises24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds : ");
        double pounds = input.nextDouble();

        double kilo =  0.454;
        double result = pounds * kilo;

        System.out.println( pounds + " pounds is " + result + " kilogram ");
    }
}
