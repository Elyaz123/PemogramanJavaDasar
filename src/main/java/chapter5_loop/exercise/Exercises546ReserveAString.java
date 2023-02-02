package chapter5_loop.exercise;

import java.util.Scanner;

public class Exercises546ReserveAString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        String reserve = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reserve += string.charAt(i);
        }
        System.out.println("The reserved string is " + reserve);
    }
}
