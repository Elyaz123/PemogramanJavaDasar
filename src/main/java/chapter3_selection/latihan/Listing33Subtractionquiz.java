package chapter3_selection.latihan;

import java.util.Scanner;

public class Listing33Subtractionquiz {
    public static void main(String[] args) {
        // 1. generate two random single digit integer
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // 2. If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
            // 3. prompt the student to answer " What is number1 - number2?"
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // 4. Grade the answer And display the result
        if (number1 - number2 == answer)
            System.out.println("you answer is wrong");
        System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
    }
}
