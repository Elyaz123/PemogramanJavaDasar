package chapter4_math.exercise;

import java.util.Scanner;

public class Exercises423FinancialApleicationPayRoll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter payroll inforation
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.println("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate; ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax witholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax witholding rate; ");
        double stateTaxrate = input.nextDouble();

        // Display payroll statemene
        double grossPay, federal, state, totalDeduction;
        System.out.printf(
                "Employee Name: " + name +
                "\nHours worked: " + hoursWorked +
                "\nPay Rate: $" + hourlyPayRate +
                "\nGross Pay: $" + (grossPay = hoursWorked * hourlyPayRate) +
                "\nDeduction:\n    Federal Witholding (20.0%): $" + (federal = grossPay * federalTaxRate) +
                "\n   Stage Witholding (9.0%); $" + (state = grossPay * stateTaxrate) +
                "\n   Total Deduction: $" + (totalDeduction = federal + state) +
                "\nNet Pay: $" + (grossPay - totalDeduction)
                 );
    }
}
