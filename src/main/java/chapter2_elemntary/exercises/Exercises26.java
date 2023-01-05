package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000 :");
        int digit = input.nextInt();

        int satuan = digit % 10;
        int counterPuluhan = digit / 10;
        int puluhan = counterPuluhan % 10;
        int ratusan = counterPuluhan / 10;

        int total = satuan + puluhan + ratusan;
        System.out.println("The sum of the digits is " + total);
    }
}
