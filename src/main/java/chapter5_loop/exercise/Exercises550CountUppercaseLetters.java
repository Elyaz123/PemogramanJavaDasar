package chapter5_loop.exercise;

import java.util.Scanner;

public class Exercises550CountUppercaseLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i)))
                count++;
        }
        System.out.println("The number of uppercase letters is " +count);
    }
}
