package chapter5_loop.exercise;

import java.util.Scanner;

public class Exercises541OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter numbrs: ");
        int max = input.nextInt();
        int count = 1;
        int number = 0;

        while (number > 0) {
            number = input.nextInt();
            if (number > max) {
                max = number;
                count = 1;
            }
            if (number == max)
                count++;
        }
        System.out.println("The largest numebr is " + max);
        System.out.println(
                "The Occurrence count of the largest number is " + count);
    }
}
