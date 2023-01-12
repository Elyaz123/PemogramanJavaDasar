package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises331CurrencyExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Peormpt the user  to enter the exchange rate from USB to RMB
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();

        // Promt the user to enter 0 to convert from USD to RMB
        // and 1 to convert RMB to USD
        System.out.print("Enter 0 to convert dollars to RMB and vice versa: ");
        int option = input.nextInt();

        // Prompt the user to enter the amount in USB or RMB
        // to convert it to RMB OR USB respectively
        double amount;
        switch (option) {
            case 0:
                System.out.print("Enter the dollars amount: ");
                amount = input.nextDouble();
                System.out.println("$" + amount + " is" + (amount * rate) + " yuan");
                break;
            case 1:
                System.out.print("Enter the RMB amount: ");
                amount = input.nextDouble();
                System.out.println(amount + " yuan is $" + ((int) ((amount * 100) / rate)) / 100.0);
                break;
            default:
                System.out.println("Incorrect input");

        }
    }
}