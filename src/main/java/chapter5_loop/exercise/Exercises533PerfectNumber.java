package chapter5_loop.exercise;

public class Exercises533PerfectNumber {
    public static void main(String[] args) {
        System.out.println("The four perfect number less than 10,000:");

        int sum;

        for (int i = 1; i < 10000; i++) {
            sum = 0;

            for (int k = 1; k < i; k++) {

                if (i % k == 0)
                    sum += k;
            }

            if (i == sum)
                System.out.printf("%20d\n", i);

            for (int number = 1; number <= 10000; number++) {
                Boolean isPerfectNumber = i == sum;


            }
        }
    }
}