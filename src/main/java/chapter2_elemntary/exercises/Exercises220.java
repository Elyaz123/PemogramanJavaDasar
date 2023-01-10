package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises220 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user t enter a balance and
        // the anual percentage interset rate
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double anualInterestRate = input.nextDouble();

        // CAlculate the interest
        double interest = balance * (anualInterestRate / 1200);

        // Display result
        System.out.println("The interest is " + interest);
    }
}
