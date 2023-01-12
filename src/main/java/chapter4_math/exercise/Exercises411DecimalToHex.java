package chapter4_math.exercise;

import java.util.Scanner;

public class Exercises411DecimalToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter an integer between 1 and 15
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        // Display its correcponding hex number
        if (decimal >= 0 && decimal <= 9)
            System.out.println("The hex value is  " + decimal);
        else if (decimal >= 10 && decimal <= 15)
            System.out.println("The hex value is " + (char)(decimal + 'A' - 10));
        else
            System.out.println(decimal + " is an invalid input");
    }
}
