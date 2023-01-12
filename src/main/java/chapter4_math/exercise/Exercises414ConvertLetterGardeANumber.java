package chapter4_math.exercise;

import javax.security.sasl.SaslClient;
import java.util.Calendar;
import java.util.Scanner;

public class Exercises414ConvertLetterGardeANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a letter grade A, B, C, D and F
        System.out.print("Enter a letter grade");
        String s = input.nextLine();
        char ch = s.charAt(0);
        ch = Character.toUpperCase(ch);

        if (ch >= 'A' && ch <= 'F' && ch != 'E')
        {
            System.out.print("The numeric value fpr grade " + ch + " is");
            switch (ch)
            {
                case 'A':
                    System.out.println(4); break;
                case 'B':
                    System.out.println(3); break;
                case 'C':
                    System.out.println(2); break;
                case 'D':
                    System.out.println(1); break;
                case 'F':
                    System.out.println(0);
            }
        }
        else
            System.out.println(ch + " is an invalid garde");
    }
}
