package chapter5_loop.exercise;

import java.util.Scanner;

public class Exercises51CountPositiveAndNegativeNumbersAndComputeTheAverageNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positives = 0;
        int negatives = 0;
        int count = 0;
        double total = 0;

        //Prompt  the user to enter an integer or 0 to exit
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        if(number == 0) {
            System.out.println("No numbers are intered exept 0");
            System.exit(1);
        }

        while (number !=0) {
            if (number > 0)
                positives++;
            else
                negatives++;
            total += number;
            count++;
            number = input.nextInt();
        }

        double average = total / count;

        System.out.println(
                "The number of positive is " + positives +
                "\nThe numbeer of negative is " + negatives +
                "\nThe total is " + total +
                "\nThe average is " + average);
    }
}
