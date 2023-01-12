package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises321DayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year, month, and day of the month
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter day of the month: 1-31: ");
        int dayOfMonth = input.nextInt();

        // Convert january and february to months 13 and 14 of the previous year
        if (month == 1 || month == 2)
        {
            month = (month == 1) ? 13 : 14;
            year--;
        }

        // Calcualte day of the week
        int dayOfweek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100) + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;

        //display result
        System.out.print("Day of the week is ");
        switch (dayOfweek)
        {
            case 0:
                System.out.println("Saturday"); break;
            case 1:
                System.out.println("Sunday"); break;
            case 2:
                System.out.println("Monday"); break;
            case 3:
                System.out.println("Tuesday"); break;
            case 4:
                System.out.println("Wednesday"); break;
            case 5:
                System.out.println("Thursday"); break;
            case 6:
                System.out.println("Friday");
        }

    }
}
