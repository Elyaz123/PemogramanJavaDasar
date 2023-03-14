package chapter10_ObjectOrientedThinking.exercises;

public class Exercises10_23_ImplementTheStringClass {
    public static void main(String[] args) {
        MyString2 str1 = new MyString2("test1");
        MyString2 str2 = new MyString2("abcdefghijklm");

        System.out.println("\nCompare str1 to \"test1\":");
        System.out.println(str1.compare("test1"));

        System.out.println("\nDisplay a substring if str2 beginning at index 5:");
        print(str2.substring(5));

        System.out.println("\nConvert str2 to upper case:");
        print(str2.toUpperCase());

        System.out.println("\nDisplay the boolean value true as a MyStirng2 object:");
        print(MyString2.valueOf(true));
    }

    public static void print(MyString2 str) {
        print(str.toChars());
    }
    public static void print(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
class MyString2 {
    // Data fields
    private String s;

    public MyString2(String s) {
        this.s = "";
        for (int i = 0; i < s.length(); i++) {
            this.s += s.charAt(i) + "";
        }
    }
    public int compare(String s) {
        int index = 0;
        if (this.s.length() < s.length())
            index = -1;
        if (s.length() < this.s.length())
            index = 1;

        for (int i = 0; i < this.s.length(); i++) {
            if (this.s.charAt(i) < s.charAt(i))
                index = -(i + 1);
            if (this.s.charAt(i) > s.charAt(i))
                index = i + 1;
        }
        return index;
    }
    public MyString2 substring(int begin) {
        String b = "";
        for (int i = begin, j = 0; i < s.length(); i++, j++) {
            b += s.charAt(i) + "";
        }
        return new MyString2(b);
    }
    public MyString2 toUpperCase() {
        String n = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                n += String.valueOf((char)(s.charAt(i) - 32));
            else
                n += String.valueOf(s.charAt(i));
        }
        return new MyString2(n);
    }
    public char[] toChars() {
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        return ch;
    }

    public static MyString2 valueOf(boolean b) {
        return (b ? new MyString2("true") : new MyString2("false"));
    }

}