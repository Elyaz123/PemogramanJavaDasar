package chapter6_Methodes.exercises;

import java.util.Scanner;

public class Exercises633Calendar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2012): ");
        int year = keyboard.nextInt();
        while (!isValidYear(year)) {				//validate input
            System.out.println("Invalid Year!");
            System.out.print("Enter full year (e.g., 2012): ");
            year = keyboard.nextInt();
        }

        System.out.print("Enter month as number between 1 and 12: ");
        int month = keyboard.nextInt();
        while (!isValidMonth(month)) {			//validate input
            System.out.println("Invalid Month!");
            System.out.print("Enter month as number between 1 and 12: ");
            month = keyboard.nextInt();
        }


        printCalendarHeader(month, year);	// print the calendar header

        printFirstDay(month, year);			// print the calendar first day

        printCalendarItself(month, year);	// print the calendar itself
    }

    public static boolean isValidYear(int year) {
        return year > 0;		//might want to check an upper bound, not sure if this formula works for HUGE numbers
    }

    public static boolean isValidMonth(int month) {
        return month > 0  &&  month <= 12;
    }

    public static void printCalendarHeader(int month, int year) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "Septemter", "October", "November", "December"};

        System.out.print("\t\t"+months[month-1]+"\t");
        System.out.println(year);
        System.out.println("---------------------------");

        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
    }
    public static void printFirstDay(int month, int year) {
        int firstDay = dayOfWeek(1, month, year);

        String leadingTabs = "1";
        for(int i = 1; i<firstDay; i++){
            leadingTabs = "\t" + leadingTabs;
        }
        if(firstDay == 0){
            leadingTabs = "\t\t\t\t\t\t1";
        }

        System.out.print(leadingTabs + "\t");
    }
    public static void printCalendarItself(int month, int year) {
        int lastDayOfMonth = lastDayOfMonth(month, year);

        for (int i = 2; i <= lastDayOfMonth; i++) {
            int printedDay = dayOfWeek(i, month, year);
            if (printedDay == 1) {
                System.out.println();
            }
            System.out.print(i + "\t");
        }
    }
    public static int dayOfWeek(int dayOfMonth, int month, int year) {
        if (month == 1 || month == 2) {
            month = month + 12;
            year--;
        }
        int q, m, j, k;
        q = dayOfMonth;
        m = month;
        j = year/100;
        k = year%100;
        int dayOfTheWeek = (q + (26*(m+1) /10) + k + k/4 + j/4 + (5*j)) % 7;
        return dayOfTheWeek;
    }
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    public static int lastDayOfMonth(int month, int year) {
        int lastDayOfMonth;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            lastDayOfMonth = 31;
        } else if (month == 2) {
            if (isLeapYear(year)) {
                lastDayOfMonth = 29;
            } else {
                lastDayOfMonth = 28;
            }
        } else {
            lastDayOfMonth = 30;
        }
        return lastDayOfMonth;
    }
}
