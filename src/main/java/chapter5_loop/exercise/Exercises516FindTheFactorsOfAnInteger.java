package chapter5_loop.exercise;

import java.util.Scanner;

public class Exercises516FindTheFactorsOfAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int number = input.nextInt();
        int index = 2;

        while (number / index != 1) {
            // Test as a factor of number
            if (number % index == 0) {
                System.out.print(index + ", ");
                number /= index;
            }
            else
                index++;
        }
        System.out.println(number + ".");
    }
}
