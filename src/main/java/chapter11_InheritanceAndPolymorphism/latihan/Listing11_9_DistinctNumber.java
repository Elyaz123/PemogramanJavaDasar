package chapter11_InheritanceAndPolymorphism.latihan;

import java.util.ArrayList;
import java.util.Scanner;

public class Listing11_9_DistinctNumber {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
         int value;

         do {
            value = input.nextInt();
            if (!list.contains(value) && value != 0)
                 list.add(value);
            } while (value != 0);

         System.out.print("The distinct integers are: ");
         for (int i = 0; i < list.size(); i++)
             System.out.print(list.get(i) + " ");

    }
 }

