package chapter7_Array.exercise;

import java.util.Scanner;

public class Exercises75_PrintDistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] distinctNUmbers = new int[10];
        int  num;
        int count = 0;

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();

            if (isDIstinct(distinctNUmbers, num)) {
                distinctNUmbers[count] = num;
                count++;
            }
        }

        System.out.println("The number of distinct number is " + count);
        System.out.print("The distinct number are");
        for (int i = 0; i < distinctNUmbers.length; i++) {
            if (distinctNUmbers[i] > 0)
                System.out.print(" " + distinctNUmbers[i]);
        }
        System.out.println();
    }

    public static boolean isDIstinct(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return false;
        }
        return true;
    }
}
