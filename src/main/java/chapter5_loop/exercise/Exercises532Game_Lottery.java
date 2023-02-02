package chapter5_loop.exercise;

import java.util.Scanner;

public class Exercises532Game_Lottery {
    public static void main(String[] args) {
        int lotteryDigit1, lotteriDigit2;
        lotteryDigit1 = (int)(Math.random() * 10);

        do {
            lotteriDigit2 = (int)(Math.random() * 10);
        }while (lotteryDigit1 == lotteriDigit2);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottrey pick (two distinct digits): ");
        int guess = input.nextInt();

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println(
                "The lottery number is " + lotteryDigit1 + lotteriDigit2);

        if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteriDigit2)
            System.out.println("Exact math: you win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteriDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1
            || guessDigit1 == lotteriDigit2
            || guessDigit2 == lotteryDigit1
            || guessDigit2 == lotteriDigit2)
            System.out.println("match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");

        }
    }

