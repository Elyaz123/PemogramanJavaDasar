package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises23 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet : ");
        double feet = input.nextDouble();

        double result = feet * 0.305;

        System.out.println(feet + "feet is " + result + "meters");
    }
}
