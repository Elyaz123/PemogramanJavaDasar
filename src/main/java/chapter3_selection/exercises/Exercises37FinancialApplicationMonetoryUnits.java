package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises37FinancialApplicationMonetoryUnits {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmaount = (int)(amount * 100);

        //Find the number of one dollars
        int numberOfDollars = remainingAmaount / 100;
        remainingAmaount %= 100;

        //Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmaount / 25;
        remainingAmaount %= 25;

        //Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmaount / 10;
        remainingAmaount %= 10;

        //Find the number of nickels in the remaining amount
        int numberOfNickles = remainingAmaount / 5;
        remainingAmaount %= 5;

        //Find the number of pennies in the remaining amount
        int numberOfpennies = remainingAmaount;

        //Display result
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfDollars + (numberOfDollars == 1 ? " dollar" : " dollars"));
        System.out.println(" " + numberOfQuarters + (numberOfQuarters == 1 ? " quarter" : " quarters"));
        System.out.println(" " + numberOfDimes + (numberOfDimes == 1 ? "dime" : "dimes"));
        System.out.println(" " + numberOfNickles + (numberOfNickles == 1 ? " nickle" : "nickles"));
        System.out.println(" " + numberOfpennies + (numberOfpennies == 1 ? " pennie" : "pennies"));

    }
}
