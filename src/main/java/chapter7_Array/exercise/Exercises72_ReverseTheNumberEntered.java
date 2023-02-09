package chapter7_Array.exercise;

import java.util.Scanner;

public class Exercises72_ReverseTheNumberEntered {
    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.print("Enter ten integer: ");

        fill(array);

        for (int i = array.length - 1; i >= 0; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void fill(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt();
    }
}
