package chapter7_Array.exercise;

import java.util.Scanner;

public class Exercises720_ReviseSelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter  ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        selectionSort(numbers);

        for (double e: numbers)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void selectionSort(double[] list) {
        for ( int i = list.length - 1; i >= 0; i--) {
            double currentMax = list[i];
            int currenMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currenMaxIndex = j;
                }
            }
            if (currenMaxIndex != i) {
                list[currenMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
