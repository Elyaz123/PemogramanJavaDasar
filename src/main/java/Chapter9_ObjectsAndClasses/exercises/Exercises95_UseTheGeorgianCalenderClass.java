package Chapter9_ObjectsAndClasses.exercises;

import java.util.GregorianCalendar;

public class Exercises95_UseTheGeorgianCalenderClass {
    public static void main(String[] args) {
        GeorgianCalender = new GregorianCalendar();

        System.out.print("\nCurrent year, month, and day in format Mh/Day/Year: ");
        System.out.println(calendar.Month) + "/" +
        calendar.get(calendar.DAY_OF_MONTH) + "/" + calendar.get(calendar.YEAR);

        calendar.setTimeMillis(1234567898765L);

        System.out.print("\nElapsed time since January 1, 1970 set to " +
                "1234567898765L in format Mth/Day/Year: ");
        System.out.println(calendar.get(calendar.MONTH) + "/" +
                calendar.get(calendar.DAY_OF_MONTH) + "/" + calendar.get(calendar.YEAR));
    }
}
