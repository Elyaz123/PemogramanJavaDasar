package chapter7_Array.exercise;

import java.util.Scanner;

public class Exercises718_BubleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        bubleSort(numbers);

        for (double e: numbers) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    public static void bubleSort(double[] list) {
        double temp;
        boolean swapped;

        do {
            swapped = false;
            for (int i= 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
