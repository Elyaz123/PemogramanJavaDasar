package chapter5_loop.latihan;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Listing55SentinelValue {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Read an initial data
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        // Keep reading data until the input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;

            //Read the text data
            System.out.print("Enter an integer (the input ends if it is o): ");
            data = input.nextInt();
        }
        System.out.println("the sum is " + sum);
    }
}
