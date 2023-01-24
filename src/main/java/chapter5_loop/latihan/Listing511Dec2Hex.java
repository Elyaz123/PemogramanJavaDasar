package chapter5_loop.latihan;

import java.util.Scanner;

public class Listing511Dec2Hex {
    public static void main(String[] args) {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a decimal integerr
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        // Convert decimal to hex
        String hex ="";

        while (decimal !=0) {
            int hexValue = decimal % 16;

            //Convert a decimal value to a hex digit
            char hexdigit = (0<= hexValue && hexValue <= 9) ?
                    (char) (hexValue + '0'): (char) (hexValue - 10 + 'A');
            hex = hexdigit + hex;
            decimal = decimal / 16;
        }
        System.out.println("The hex number is" + hex);
    }
                                                                                               }
