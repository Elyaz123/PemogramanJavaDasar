package chapter10_ObjectOrientedThinking.exercises;

public class Exercises10_3_MyIntegerClass {
    public static void main(String[] args) {
        int[] values = {5, 6, 7, 8, 9};

        System.out.println("\nTest if values are even using isEven(int):");
        for (int  i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
        }
        System.out.println("\nTest if valus are odd using isOdd(int):");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isOdd(values[i]));
        }
        System.out.println("\nTest if values are prime using isPrime(int):");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
        }
        System.out.println("\nTest is values are even using isEven():");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isEven);
        }
        System.out.println("\nTest if valus are odd usingIsOdd():");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isOdd);
        }
        System.out.println("\nTest if values are prime using isPrime():");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isPrime());
        }
        System.out.println("\nTest if values are even using isEven(MyInteger):");
        for (int  i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isEven(value));
        }
        System.out.println("\nTest if values are odd using isOdd(MyInteger):");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
        }
        System.out.println("\nTest if values are prime using isPrime(MyInteger):");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
        }

        int[] values2 = {5, 9, 7};
        MyInteger value = new MyInteger(9);
        System.out.println("\nTest if " + value.getValue() +
                " is equal to the specified value:");
        for (int i = 0; i < values2.length; i++) {
            System.out.println(values2[i] + " " + value.equals(values2[i]));
        }
        System.out.println("\nTest if " + value.getValue() +
                " is equal to the specified value:");
        for (int i = 0; i < values2.length; i++) {
            MyInteger myInteger = new MyInteger(values2[i]);
            System.out.println(values2[i] + " " + value.equals(myInteger));
        }
        System.out.println("\nTest parseInt(char[]) and parseInt(String):");
        char[] numericCharacters = {'3', '4', '2'};

        String numericString = "658";
        System.out.print("\'");
        for (int i = 0; i < numericCharacters.length; i++) {
            System.out.print(numericCharacters[i] + "");
        }
        System.out.println("\' + \"" + numericString + "\" = " +
                (MyInteger.parseInt(numericCharacters) +
                        MyInteger.parseInt(numericString)));
    }
}

class MyInteger {
    public int isEven;
    public int isOdd;
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(int value) {
        return  value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0)
                return  false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();//value % 2 == 0;
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();//value % 2 != 0;
    }

    public static boolean isPrime(MyInteger myInteger) {
        for (int divisor = 2; divisor <= myInteger.value / 2; divisor++) {
            if (myInteger.value % divisor == 0)
                return false;
        }
        return true;
    }
    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return myInteger.value == this.value;
    }

    public static int parseInt(char[] chars) {
        int value = 0;
        for (int i = 0, j = (int)Math.pow(10, chars.length - 1);
             i < chars.length; i++, j /= 10) {
            value += (chars[i]- 48) * j;
        }
        return value;
    }

    public static int parseInt(String str) {
        int value = 0;
        for (int i = 0, j = (int)Math.pow(10, str.length() - 1);
             i < str.length(); i++, j /= 10) {
            value += (str.charAt(i) - 48) * j;
        }
        return value;
    }
}


