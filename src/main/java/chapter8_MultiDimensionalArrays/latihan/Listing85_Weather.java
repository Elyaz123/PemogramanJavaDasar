package chapter8_MultiDimensionalArrays.latihan;

import java.util.Scanner;

public class Listing85_Weather {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        Scanner input = new Scanner(System.in);

        for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextInt();
            double humidity = input.nextDouble();
            data[day - 1][hour - 1][0] = temperature;
            data[day - 1][hour - 1][1] = humidity;
        }

        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            double dailyTemperatureTotal = 0, dailyHumadityTotal = 0;
            for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                dailyTemperatureTotal += data[i][j][0];
                dailyHumadityTotal += data[i][j][1];
            }

            System.out.println("Day "+ i + " 's average temperature is " + dailyTemperatureTotal / NUMBER_OF_HOURS);
            System.out.println("Day " + i + " 's average humidity is " + dailyHumadityTotal / NUMBER_OF_HOURS);
        }
    }
}
