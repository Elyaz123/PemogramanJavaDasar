package chapter8_MultiDimensionalArrays.exercises;

import java.util.Scanner;

public class Exercises814_ExploreMatrix {
    public static void main(String[] args) {

        int[][] matrix = getMatrix();

        print(matrix);

        int[] rows = allRow(matrix);
        int count = 0;
        for (int i = 0; i < rows.length; i++) {
            if (rows[i] >= 0)
                System.out.println("All " + rows[i] + "s on row " + (i + 1));
            else
                count++;
            if (count == rows.length)
                System.out.println("No same numbers on a row");
        }

        int[] columns = allColumn(matrix);
        count = 0;
        for (int  i = 0; i < columns.length; i++) {
            if (columns[i] >= 0)
                System.out.println("All " + columns[i] + "s on culumn " + (i + 1));
            else
                count++;
            if (count == columns.length)
                System.out.println("No same numbers on a column");
        }

        int n = allMajorDiagonal(matrix);
        switch (n) {
            case 0:
            case 1:
                System.out.println("All " + n + "s on the major diagonal"); break;
            default:
                System.out.println("No same numbers on the major diagonal");
        }

        n = allSubDiagonal(matrix);
        switch (n) {
            case 0:
            case 1:
                System.out.println("All " + n + "s on the  sub-diagonal"); break;
            default:
                System.out.println("No same numbers on the sub-diagonal");
        }

    }

    public static int allSubDiagonal(int[][] m) {
        int[] count = new int [2];

        count[0] = 0;
        count[1] = 0;
        for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
            count[m[i][j]]++;
            if (count[0] == m.length)
                return 0;
            if (count[1] == m.length)
                return 1;
        }
        return -1;
    }

    public static int allMajorDiagonal(int[][] m) {
        int[] count = new int[2];

        count[0] = 0;
        count[1] = 0;
        for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
            count[m[i][j]]++;
            if (count[0] == m.length)
                return 0;
            if (count[1] == m.length)
                return 1;
        }
        return -1;
    }

    public static int[] allColumn(int[][] m) {

        int[] result = new int[m.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        int[] count = new int[2];
        for (int i = 0; i < m.length; i++) {

            count[0] = 0;
            count[1] = 0;

            for (int j = 0; j < m[i].length; j++) {
                count[m[i][j]]++;
                    if (count[0] < j +1 && count[1] < j + 1) {
                        break;
                    }
            }

            if (count[0] >= m.length || count[1] >= m.length)
                result[i] = count[0] > count[1] ? 0 : 1;
        }
        return result;
    }

    public static int[] allRow(int[][] m) {
        int[] result = new int[m.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        int[] count = new int[2];
        for (int i = 0; i < m.length; i++) {

            count[0] = 0;
            count[1] = 0;

            for (int j = 0; j < m[i].length; j++) {
                count[m[i][j]]++;
                if (count[0] < j +1 && count[1] < j + 1) {
                    break;
                }
            }

            if (count[0] >= m.length || count[1] >= m.length)
                result[i] = count[0] > count[1] ? 0 : 1;
        }
        return result;
    }

    public static int[][] getMatrix() {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int[][] m = new int[size][size];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int)(Math.random() * 2);
            }
        }
        return m;
    }

    public static void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
