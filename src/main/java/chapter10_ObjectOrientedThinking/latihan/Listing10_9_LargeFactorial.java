package chapter10_ObjectOrientedThinking.latihan;
import java.util.Scanner;
import java.math.*;

public class Listing10_9_LargeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = input.nextInt();

        System.out.println(n +"! is \n" + factorial(n));
    }

    public static BigInteger factorial( long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigInteger(i + ""));

        return result;
    }
}
