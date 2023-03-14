package Chapter9_ObjectsAndClasses.exercises;

public class Exercises93_UseTheDateClass {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();

        System.out.println("\nThe and times for elapsedtimes 10000, " +
                "100000, 1000000, 10000000, \n100000000, 1000000000, 10000000000," +
                " and 100000000000, respectively");
        for (long i = 10000; i < 1e11; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}
