package chapter5_loop.exercise;

import java.util.Scanner;

public class Exercises52ReapeatAddition {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS =10;
        int correctcount = 0;
        int count = 0;
        long starTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // 1.Generate two random single-digit integer
            int number1 = 1 + (int)(Math.random() * 15);
            int number2 = 1 + (int)(Math.random() * 15);

            // 2. Prompt the student to answer "What is number1 + number2?"
            System.out.print(
                    "What is " + number1 + " + " + number2 + "? ");
            int anwers = input.nextInt();

            //3. Garde the answe and dispaly the result
            if (number1 + number2 == anwers) {
                System.out.println("You are correct!");
                correctcount++;
            }
            else
                System.out.println("Your answer is wrong.\n" + number1
                        + " + " + number2 + " should be " + (number1 + number2));

            // Increase the question count
            count++;

            output += "\n" + number1 + "+" +number2 + "=" + anwers +
                    ((number1 + number2 == anwers) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - starTime;

        System.out.println("Correct count is " + correctcount +
                "\nTes time is " + testTime / 1000 + " seconds\n" + output);
    }
}
