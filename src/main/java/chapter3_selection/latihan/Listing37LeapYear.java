package chapter3_selection.latihan;

import java.util.Scanner;

public class Listing37LeapYear {
    public static void main(String[] args) {
        //create a scanner
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYaer =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        //display result
        System.out.println(year + " is a leap year? " + isLeapYaer);
    }
}
