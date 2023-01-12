package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises35FindFutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer for today's day of the week
        System.out.print("Enter today's day: ");
        int day = input.nextInt();

        // Prompt the user to enter the number of days after today
        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();

        // Calculate future day
        int futureDay = (day + daysElapsed ) % 7;

        System.out.print("Today is ");
        switch (day)
        {
            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday");
        }

        System.out.print(" and the future day is ");
        switch (futureDay)
        {
            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday");
        }
    }
}
