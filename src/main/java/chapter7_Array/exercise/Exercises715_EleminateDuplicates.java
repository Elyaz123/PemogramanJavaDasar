package chapter7_Array.exercise;

import java.util.Scanner;

public class Exercises715_EleminateDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten number: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        int[] distinctNumber = eliminateDuplicates(numbers);

        System.out.print("The distinct number are:");
        for (int e: distinctNumber) {
            if (e > 0)
                System.out.print(" " + e);
        }
        System.out.println();
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length];
        int i = 0;
        for (int e: list) {
            if (linearSearch(distinctList, e) == -1) {
                distinctList[i] = e;
                i++;
            }
        }
        return distinctList;
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }
}
