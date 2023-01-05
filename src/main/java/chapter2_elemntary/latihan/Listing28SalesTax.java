package chapter2_elemntary.latihan;

import java.util.Scanner;

public class Listing28SalesTax {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amout: ");
        double purchaseAmout = input.nextDouble();

        double tax = purchaseAmout * 0.06;
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
    }
}
