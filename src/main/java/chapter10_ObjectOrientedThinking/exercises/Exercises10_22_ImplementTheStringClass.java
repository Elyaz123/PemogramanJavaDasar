package chapter10_ObjectOrientedThinking.exercises;

public class Exercises10_22_ImplementTheStringClass {
    public static void main(String[] args) {

        char[] test = {'T', 'e', 'S', 't'};
        char[] test2 = {'T', 'e', 'S', 't', '2'};

        MyString1 str = new MyString1(test);
        MyString1 str2 = new MyString1(test2);

        System.out.println("\nCharacter at index 1 of MyString1 object 1: "
                + str.charAt(1));

        System.out.println("\nLength of MyString1 object 1: " + str.length());

        System.out.println("\nSubstring from index 2 to 4 of MyString1 object 1: ");
        MyString1 substr = str.substring(2,4);
        for (int i = 0; i < substr.length(); i++) {
            System.out.print(substr.charAt(i));
        }
        System.out.println();

        System.out.println("\nMyString1 object 1 to lowercase:");
        MyString1 lower = str.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            System.out.print(lower.charAt(i));
        }
        System.out.println();

        System.out.println("\nMyString1 object 1 is equal to MyString1 object 2? "
                + str.equals(str2));

        System.out.println("\nDisplay the integer 145 as a MyString1 object: ");
        MyString1 value = str.valueOf(145);
        for (int i = 0; i < value.length(); i++) {
            System.out.print(value.charAt(i));
        }
        System.out.println();

    }
}

class MyString1 {
    private char[] chars;
    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] ch = new char[end - begin];
        for (int i = begin, j = 0; i < end; i++, j++) {
            ch[j] = chars[i];
        }
        return new MyString1(ch);
    }

    public MyString1 toLowerCase() {
        char[] ch = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z')
                ch[i] = (char)(chars[i] + 32);
            else
                ch[i] = chars[i];
        }
        return new MyString1(ch);
    }

    public boolean equals(MyString1 s) {
        if (chars.length != s.length())
            return false;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != s.charAt(i))
                return false;
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        // Count the number of digits in i
        int length = 0;
        int n = i;
        while (n >= 1) {
            n /= 10;
            length++;
        }

        char[] ch = new char[length];

        for (int j = 0, k = (int)Math.pow(10, length - 1);
             j < length; j++, k /= 10) {
            ch[j] = Character.forDigit((i / k), 10);
            i %= k;
        }

        return new MyString1(ch);
    }
}