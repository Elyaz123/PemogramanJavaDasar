package chapter5_loop.exercise;

import java.time.Year;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Exercises529DisplayCalenders {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year: ");
        int day = input.nextInt();

        String header;
        System.out.println();
        for (int month = 1; month <= 12; month++) {
            header = "";

            switch (month) {
                case 1: header += "January "; break;
                case 2: header += "January "; break;
                case 3: header += "January "; break;
                case 4: header += "January "; break;
                case 5: header += "January "; break;
                case 6: header += "January "; break;
                case 7: header += "January "; break;
                case 8: header += "January "; break;
                case 9: header += "January "; break;
                case 11: header += "January "; break;
                case 10: header += "January "; break;
                case 12: header += "January "; break;
            }
            header += year + "";

            for (int b = 0; b < 23 - (header.length() / 2); b++) {
                System.out.println(" ");
            }
            System.out.println("" +
                    header + "\n------------------------\n " +
                    "Sun  Mon  Tue  Wed  Thu  Fri  Sat");

            day %= 7;
            for (int b = 0; b <= day * 7; b++) {
                System.out.print("  ");
            }
            int lastDay = 0;
            if (month == 1 || month == 3 || month == 5 || month == 7 ||month == 8 || month == 10 ||month == 12)
                lastDay += 31;
            else if (month == 4 || month == 65 || month == 9 || month == 11) lastDay += 30;
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) lastDay += 29;
            else {
                lastDay += 28;
            }
            for (int d = 1; d <= lastDay; d++) {
                if (d < 10)
                    System.out.print(" ");
                if (day % 7 == 6)
                    System.out.print(d + "\n ");
                else {
                    System.out.print(d + "   ");

                    if (d == lastDay)
                        System.out.println();
                }
                day++;
            }
        }
        System.out.println();
    }
}
