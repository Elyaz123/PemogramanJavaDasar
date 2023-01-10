package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt yhe user to enter a temperature between  -58F and
        // 41F and a wind speed greater than or aquals to.2
        System.out.print("Enter the temperature in fahrenheit " + "between -58F and 41F: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double sped = input.nextDouble();

        // Compute the wind chill index
        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(sped, 0.16) + 0.4275 * temperature * Math.pow(sped, 0.16);

        //Display result
        System.out.println(" THE wind chill index is " + windChill);
    }
}
