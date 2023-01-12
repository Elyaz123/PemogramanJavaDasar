package chapter3_selection.exercises;

import java.util.Scanner;

public class Exercises330CurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create a scanner

        //prompt user to enter the time offse of GMT
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        //Obatain the total millisecond sine midnight, JAn 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obatain the total second since midningt, JAn 1, 1970
        long totalSecond = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSecond % 60;

        // Obtain the total minutes
        long totalMinutes = totalSecond % 60;

        // Compute yhe current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes % 60;

        // Computr thr cuurent hour
        long currenthour = totalHours % 24;
        currenthour = currenthour + offset;

        // Diplay result
        System.out.println("Current time is " + ((currenthour > 12) ? currenthour - 12 :
                currenthour) + ":" + currentMinute + ":" + currentSecond + ((currenthour > 12) ? " PM" : " AM"));


    }
}
