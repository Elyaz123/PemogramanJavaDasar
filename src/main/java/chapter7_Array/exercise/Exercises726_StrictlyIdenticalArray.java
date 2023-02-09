package chapter7_Array.exercise;

import java.util.Scanner;

public class Exercises726_StrictlyIdenticalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();

        System.out.println("Two list are" + (equals(list1, list2) ? " " : " not")
                 + "strictly identical");
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }
}
