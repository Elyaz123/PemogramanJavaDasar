package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises315Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Generate a random three-digit number
        int lottery = (int)(Math.random() * 1000);

        // Prompt the user to enter a rhree-digit number
        System.out.print("Enter a three-digit number: ");
        int guess = input.nextInt();

        //Extract from lottery
        int lotteryDigit1 = lottery / 100;
        int remainingDigits = lottery % 100;
        int lotteryDigit2 = remainingDigits / 10;
        int lotteryDigit3 = remainingDigits % 10;

        // Extract digits from guess
        int guessDigit1 = guess / 100;
        int remainingDigit = guess % 100;
        int guessDigit2 = remainingDigits / 10;
        int guessDIgit3 = remainingDigits % 10;

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if(guess == lottery)
            System.out.println("Exact math: you win $10,000");
        if (guessDigit1 == lotteryDigit2)
        {

        }
    }
}
