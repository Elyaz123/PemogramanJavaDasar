package chapter5_loop.latihan;

import java.util.Scanner;

public class Listing54SubtracktionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTION = 5;
        int corretCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTION) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                corretCount++;
            } else
                System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));

            count++;
            output += "\n" + number1 + "-" + number2 + "-" + answer + ((number1 - number2 == answer) ? " corret" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count id " + corretCount +
                "\nTest Time is " + testTime / 1000 + " seconds\n" + output);
    }
}
