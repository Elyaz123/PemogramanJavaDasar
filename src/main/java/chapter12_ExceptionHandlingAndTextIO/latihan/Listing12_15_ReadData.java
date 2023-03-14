package chapter12_ExceptionHandlingAndTextIO.latihan;

import java.util.Scanner;

public class Listing12_15_ReadData {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("scores.txt");

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(
                    firstName + " " + lastName + " " + score);
        }

        input.close();
    }
}
