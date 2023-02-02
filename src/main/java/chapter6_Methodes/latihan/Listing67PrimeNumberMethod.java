package chapter6_Methodes.latihan;

public class Listing67PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printprimeNumbers(50);
    }

    public static void printprimeNumbers(int numberOfprimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < numberOfprimes) {
            if (isprime(number)) {
                count++;

                if(count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5d\n", number);
                }
                else
                    System.out.printf("%-5d", number);
            }
            number++;
        }
    }
    public static boolean isprime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
            return false;
        }
    }

    return true;
    }
}
