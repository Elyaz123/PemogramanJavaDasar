package chapter5_loop.exercise;

import java.util.Scanner;

public class Exercises521CompareLoansWithvariusInterestRates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.println(
                "Interest rate    Monthly Payment    Total Payment");

        for (double i = 5.0; i <= 8; i += 0.125) {
            System.out.printf("%-5.3f", i);
            System.out.print("%           ");
            double moonthlyInterestRate = i / 1200;
            double moonthlyPayment = loanAmount * moonthlyInterestRate / (1
            - 1 / Math.pow(1 + moonthlyInterestRate, numberOfYears * 12));
            System.out.printf("%-19.2f", moonthlyPayment);
            System.out.printf("%-8.2f\n",(moonthlyPayment * 12) * numberOfYears);
            }
        }
    }

