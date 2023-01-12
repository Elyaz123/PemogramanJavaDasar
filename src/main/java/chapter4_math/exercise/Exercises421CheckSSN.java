package chapter4_math.exercise;

import java.util.Scanner;

public class Exercises421CheckSSN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a social security number
        System.out.print("ENter a SSN: ");
        String ssn = input.nextLine();

        // Check wether the input is valid
        boolean isValid =
                (ssn.length() == 11) &&
                        (Character.isDigit(ssn.charAt(0))) &&
                        (Character.isDigit(ssn.charAt(1))) &&
                        (Character.isDigit(ssn.charAt(2))) &&
                        (ssn.charAt(3) == '-') &&
                        (Character.isDigit(ssn.charAt(4))) &&
                        (Character.isDigit(ssn.charAt(5))) &&
                        (Character.isDigit(ssn.charAt(7))) &&
                        (ssn.charAt(6) == '-') &&
                        (Character.isDigit(ssn.charAt(8))) &&
                        (Character.isDigit(ssn.charAt(9))) &&
                        (Character.isDigit(ssn.charAt(10)));


        // Display result
        System.out.println(ssn + " is " + ((isValid) ? "a valid " : "an invalid ") + "social cecurity number");
    }
}
