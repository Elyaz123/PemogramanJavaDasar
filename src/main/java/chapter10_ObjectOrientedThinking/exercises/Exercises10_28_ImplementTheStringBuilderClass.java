package chapter10_ObjectOrientedThinking.exercises;

public class Exercises10_28_ImplementTheStringBuilderClass {
    public static void main(String[] args) {
        char[] chars = {'I', 'n', 's', 'e', 'r', 't'};

        MyStringBuilder2 str1 = new MyStringBuilder2("testString");
        MyStringBuilder2 str2 = new MyStringBuilder2(chars);

        System.out.print("\nInsert string 2 into string 1 at index 3: ");
        MyStringBuilder2 str3 = str1.insert(3, str2);
        System.out.println(str3);

        System.out.println("\nReverse string 1: " + str1.reverse());

        System.out.println("\nSubstring of string 3 beginning index 10: " +
                str3.substring(10));

        System.out.println("\nString 2 to upper case: " + str2.toUpperCase());
    }
}

class MyStringBuilder2 {
    private String s;

    public MyStringBuilder2() {
        s = "";
    }
    public MyStringBuilder2(char[] chars) {
        s = String.valueOf(chars);
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String newStr = "";
        int i;
        for (i = 0; i < offset; i++) {
            if (i < offset)
                newStr += this.s.charAt(i) + "";
        }
        newStr += s;
        return new MyStringBuilder2(newStr + substring(offset));
    }

    public MyStringBuilder2 reverse() {
        String newStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newStr += s.charAt(i) + "";
        }
        return new MyStringBuilder2(newStr);
    }

    public MyStringBuilder2 substring(int begin) {
        String newStr = "";
        for (int i = begin; i < s.length(); i++) {
            newStr += s.charAt(i) + "";
        }
        return new MyStringBuilder2(newStr);
    }

    public MyStringBuilder2 toUpperCase() {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                newStr += (char)(s.charAt(i) - 32) + "";
            else
                newStr += s.charAt(i) + "";
        }
        return new MyStringBuilder2(newStr);
    }

    public String toString() {
        return s;
    }

    public int length() {
        return s.length();
    }

    public char charAt(int index) {
        return s.charAt(index);
    }
}