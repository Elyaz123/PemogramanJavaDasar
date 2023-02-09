package chapter7_Array.exercise;

import java.util.Scanner;

public class Exercises73_CountOccurrenceOfNumbers {
    public static void main(String[] args) {
        int[] counts = new int[100];

        System.out.print("Enter the integers between 1 and 100: ");

        count(counts);

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0)
                System.out.println((i + 1)  + " occurs " + counts[i] +
                        " time" + (counts[i] > 1 ? "s" : ""));
        }
    }

    public static void count(int[] counts) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            num = input.nextInt();
            if (num >= 1 && num <= 100)
                counts[num - 1]++;
        } while (num != 0);
    }
}
