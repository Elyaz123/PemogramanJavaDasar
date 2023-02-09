package chapter7_Array.exercise;

import java.util.Scanner;

public class Exercises728_Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        printCombination(numbers);
    }
    public static void printCombination(int[] numbers) {
        for ( int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j)
                    System.out.println(numbers[i] + " " + numbers[j]);

            }
        }
    }
}
