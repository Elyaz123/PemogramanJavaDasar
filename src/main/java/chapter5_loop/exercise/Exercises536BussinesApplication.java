package chapter5_loop.exercise;

import java.util.Scanner;

public class Exercises536BussinesApplication {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as intger: ");
        String isbn = input.nextLine();

        int d10 = 0;

        for (int i = 0; i < 9; i++) {
            d10 += Integer.parseInt(isbn.charAt(i) + "") * (i + 1);
        }
        d10 %= 11;

        for (int i = 0; i < 9; i++ ) {
            System.out.print(isbn.charAt(i));
        }

        if (d10 == 10)
            System.out.println("X");
        else
            System.out.println(d10);
    }
}
