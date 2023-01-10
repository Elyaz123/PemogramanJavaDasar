package chapter2_elemntary.exercises;

import java.util.Scanner;

public class exercises222 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Recaive the amount
        System.out.print("Enter an amount as integer, for example 1156 for 11.56: ");
        int amount = input.nextInt();
        int remainingAmount = amount;

        // Find the numbers of dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        // Find the number  of dimes in the remaing amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        // Find the number of nickels in the remaining amount'
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        // Find the number of pennies in the remaining maount
        int numberOfPennies = remainingAmount;

        //DISplay result
        System.out.println("Your amount " + amount / 100.0 + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + "quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + "pennies");
    }
}
