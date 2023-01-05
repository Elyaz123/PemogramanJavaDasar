package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in celsius :");
        double celcius = input.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celcius + 32;
        System.out.println(celcius + " celcius is " + fahrenheit + " fahrenheit");
    }
}
