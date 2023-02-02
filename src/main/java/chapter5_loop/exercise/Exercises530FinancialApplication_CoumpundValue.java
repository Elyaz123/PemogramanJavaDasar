package chapter5_loop.exercise;

import java.util.Scanner;

public class Exercises530FinancialApplication_CoumpundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount (e.g., 100): ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double anualInterestRate = input.nextDouble();
        System.out.print("Enter the number of months (e.g., 6): ");
        int mounths = input.nextInt();

        double monthlyInterestRAte = anualInterestRate / 1200;

        double compoundvalue = 0;
        for (int m = 1; m <= mounths; m++) {
            compoundvalue = ( amount + compoundvalue) * (1 + monthlyInterestRAte);
        }
        System.out.printf(
                "Amount in savings account after " +
                mounths + " months: $%.2f\n", compoundvalue);
    }
}
