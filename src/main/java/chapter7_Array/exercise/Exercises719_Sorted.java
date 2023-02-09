package chapter7_Array.exercise;

import java.util.Scanner;

public class Exercises719_Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();

        System.out.println(
                "The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
    }

    public static boolean isSorted(int[] list) {
        for (int i= 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1])
                return false;
        }
        return true;
    }
}
