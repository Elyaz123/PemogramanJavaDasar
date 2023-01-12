package chapter4_math.exercise;

import java.util.Scanner;

public class Exercises417DaysOfAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a year and
        // the first trhee letter of a month name
        System.out.print("ENter a year: ");
        int year = input.nextInt();
        System.out.print(" Enter a month: ");
        String month = input.next();

        // Test for leap year
        boolean leapYear =
                ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        //Display tehe number of day in the month
        System.out.print(month + " " + year + " has ");

        if (month.equals("Jan") || month.equals("Mar") ||
                month.equals("May") || month.equals("Jul") ||
                month.equals("Aug") || month.equals("Oct") ||
                month.equals("Dec"))
            System.out.println(31 + " days");
        else if (month.equals("Apr") || month.equals("JUn") ||
                month.equals("Sep") || month.equals("Nov"))
            System.out.println(30 + " days");
        else
            System.out.println(((leapYear) ? 29 : 28) + " days");
    }
}
