package chapter2_elemntary.exercises;

import java.util.Scanner;

public class Exercises223 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Promt the user to enter distance to drive, the fuel
        // effeciency  of the car in miles and price the gallon.
        System.out.print("Enetr the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPErGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricrPerGAllon = input.nextDouble();

        // Compute the cost of driving
        double costOfDriving = (distance / milesPErGallon) * pricrPerGAllon;

        // Display result
        System.out.println("The cost of driving is $" + costOfDriving);

    }
}
