package chapter4_math.exercise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercises418StudentMajorAndStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter two character
        System.out.print("Enter two charcter: ");
        String str = input.nextLine();

        //extract major and status from string
        char m = Character.toLowerCase(str.charAt(0));
        char s = str.charAt(1);

        // Display teh major and status represented in character
        switch (m)
        {
            case 'M':
                System.out.print("Matematics "); break;
            case 'C':
                System.out.print("Computer Science "); break;
            case 'I':
                System.out.print("Information Technology "); break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
        }
        switch (s)
        {
            case '1':
                System.out.println("Freshman"); break;
            case '2':
                System.out.println("Shophomore"); break;
            case '3':
                System.out.println("Junior"); break;
            case '4':
                System.out.println("Senior"); break;
            default:
                System.out.println("Invalid input");
        }
    }
}
