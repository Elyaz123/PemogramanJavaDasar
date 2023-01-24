package chapter5_loop.latihan;

import java.util.Scanner;

public class Listing52gGuessNumberOneTime {
    public static void main(String[] args) {
        // Generate a random number to be guessed
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("\nENter your guess: ");
        int guess = input.nextInt();

        if (guess == number)
            System.out.println("Yes, the number is " + number);
        else if (guess > number)
            System.out.println("Your guess is too high");
        else
            System.out.println("Your guess is too low");

        }
    }
