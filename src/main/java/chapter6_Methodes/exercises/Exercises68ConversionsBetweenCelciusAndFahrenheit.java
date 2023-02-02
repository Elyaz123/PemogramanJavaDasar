package chapter6_Methodes.exercises;

public class Exercises68ConversionsBetweenCelciusAndFahrenheit {
    public static void main(String[] args) {
        System.out.println(
                "Celcius    Fahrenheit   |   Fahrenheit   Celcius\n" +
                "---------------------------------------------------");
        for (double celcius = 40.0, fahrenheit = 120.0;
                 celcius >= 31.0; celcius--, fahrenheit -= 10) {
            System.out.printf("%-12.1f", celcius);
            System.out.printf("%-15.1f|", cesiusToFahrenheit(celcius));
            System.out.printf("     %-15.11f", fahrenheit);
            System.out.printf("%-7.2f\n\n", fahrenheitToCelsius(fahrenheit));

        }
    }
    public static double cesiusToFahrenheit(double celcius) {
        return (9.0 / 5) * celcius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
