package chapter6_Methodes.latihan;

public class Listing65TestPassByValue {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println("before invoking the swap methode, num1 is " + num1 + " and num2 is" + num2);

        swap(num1, num2);

        System.out.println("After invoking the swap methode, num1 is " + num1 + " and num2 is" + num2);
    }

    /** Swap two variables */
    public static void swap(int n1, int n2) {
        System.out.println("\tInside the swap method");
        System.out.println("\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\tAfter swapping, n1 is " + n1 + " and n2 is " +  n2);
    }
}
