package chapter10_ObjectOrientedThinking.exercises;

public class Exercises10_27_ImplemnetsTheStringBuilderClass {
    public static void main(String[] args) {
        MyStringBuilder1 str1 = new MyStringBuilder1("TEST");

        System.out.println("\nAppend the string \" MyStringBuilder1\" to string: " +
                str1.append(new MyStringBuilder1(" MyStringBuilder1")));

        System.out.println("\nAppend integer 101 to the string: " + str1.append(101));

        System.out.println("\nLength of string: " + str1.length());

        System.out.println("\nCharacter at index 2: " + str1.charAt(2));

        System.out.println("\nString to lower case: " + str1.toLowerCase());

        System.out.println("\nSubstring of string from index 1 to 3: " +
                str1.substring(1, 3));

        System.out.println("\nDisplay string: " + str1.toString());
    }
}

class MyStringBuilder1 {
    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        String newStr  = this.s;
        newStr += s;
        return new MyStringBuilder1(newStr);
    }

    public MyStringBuilder1 append(int i) {
        String newStr  = this.s;
        newStr += i + "";
        return new MyStringBuilder1(newStr);
    }

    public int length() {
        return s.length();
    }

    public char charAt(int index) {
        return s.charAt(index);
    }

    public MyStringBuilder1 toLowerCase() {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                newStr += (char)(s.charAt(i) + 32) + "";
            }
        }
        return new MyStringBuilder1(newStr);
    }

    public MyStringBuilder1 substring(int begin, int end) {
        String newStr = "";
        for (int i = begin; i < end; i ++) {
            newStr += s.charAt(i) + "";
        }
        return new MyStringBuilder1(newStr);
    }

    public String toString() {
        return s;
    }
}