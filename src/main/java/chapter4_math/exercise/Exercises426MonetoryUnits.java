package chapter4_math.exercise;

import java.util.Scanner;

public class Exercises426MonetoryUnits {
    public static void main(String[] args) {
        // Crate a scanner
        Scanner input = new Scanner(System.in);

        // recaive the amount
        System.out.print("Enter an amount, for example 11.56: ");
        String amount = input.nextLine();

        // Extract number of dollars
        String  numberOfOneDollars = amount.substring(0, amount.indexOf('.'));

        // Extract cents
        int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

        // find the number of quarters
        int numberOfQuarters = cents / 25;
        cents %= 25;

        // Find the number of dimes
        int numberOfDimes = cents / 10;
        cents %= 10;

        // Find the number Of nickles
        int numberOfNickles = cents / 5;
        cents %= 5;

        // Display result
        System.out.println("your amount " + amount + " consist of\n "
                + numberOfOneDollars + " dollars\n "
                + numberOfQuarters + " quarters\n "
                + numberOfDimes +  " dimes\n "
                + numberOfNickles + " nickles\n "
                + cents + " pennies\n "
                 );
    }
}
