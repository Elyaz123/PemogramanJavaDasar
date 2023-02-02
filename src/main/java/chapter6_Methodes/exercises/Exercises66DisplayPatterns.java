package chapter6_Methodes.exercises;

import java.util.Scanner;

public class Exercises66DisplayPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numberOfRows = input.nextInt();

        displayPattern(numberOfRows);
    }
    public static  void displayPattern(int n) {
        int padding = n - 1;
        for (int r = 1; r <= n; r++) {

            for (int p = 0; p < padding; p++) {
                System.out.print("  ");
            }
            for (int i = r; i > 0; i--) {
                System.out.println(i + " ");
            }
            System.out.println();
            padding--;
        }
    }
}
