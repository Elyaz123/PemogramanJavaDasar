package chapter5_loop.exercise;

public class Exercises510FindNumbersDivisibleBy5And6 {
    public static void main(String[] args) {
        final  int NUMBERS_PER_LINE =10;
        int count = 0;

        // Test all numbers from 100 to 1,000
        for (int i = 100; i <= 1000; i++) {
            // Test if number is divisible by 5 and 6
            if (i % 5 == 0 && i % 6 == 0) {
                count++;
                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.println(i + " ");
            }
        }
    }
}
