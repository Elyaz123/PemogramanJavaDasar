package chapter11_InheritanceAndPolymorphism.exercises;

import java.util.Scanner;
import java.util.ArrayList;


public class Exercises11_7_ShuffleArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.print("Enter a list of integers ending with 0: ");
        Integer number = input.nextInt();

        while (number.intValue() != 0) {
            list.add(number);
            number = input.nextInt();
        }

        // Invoke shuffle method
        shuffle(list);

        // Display shuffled list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    /** Shuffles the elements in an ArrayList of integers */
    public static void shuffle(ArrayList<Integer> list) {
        java.util.Collections.shuffle(list);
    }
}
