package Chapter9_ObjectsAndClasses.exercises;

import javax.xml.stream.Location;
import java.util.Scanner;

public class Exercises913_TheLocationClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] array = new double[rows][columns];
        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location max = locateLargest(array);

        System.out.println("The location of the largest element is " +
                max.maxValue + " at (" + max.row + ", " + max.column + ")");
    }

    public static Location locateLargest(double[][] a) {
        return new Location(a);

    }
}

public class Location {
    int row;
    int column;
    double maxValue;

    Location(double[][] a) {
        maxValue = a[0][0];
        row = 0;
        column = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
    }
}