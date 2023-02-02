package chapter6_Methodes.exercises;

import java.util.Scanner;

public class Exercises67ComputeThefutureInvesmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_YEARS = 30;

        System.out.print("\nThe Amount Invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestrate = annualInterestRate / 1200;

        System.out.println("Years   Future value");
        for (int years = 1; years <= NUMBER_OF_YEARS; years++) {
            System.out.printf("%-10d", years);
            System.out.printf("%11.2f\n",
                    futureInvesmentValue(amount, monthlyInterestrate, years));
        }
    }
    public static  double futureInvesmentValue(
            double invesmentAmount, double monthlyInterestRate, int years) {
        return  invesmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
