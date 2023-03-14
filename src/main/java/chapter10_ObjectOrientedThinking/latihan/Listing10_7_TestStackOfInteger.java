package chapter10_ObjectOrientedThinking.latihan;

import java.util.Stack;

public class Listing10_7_TestStackOfInteger {
    public static void main(String[] args) {
        Listing10_7_TestStackOfInteger stack = new Listing10_7_TestStackOfInteger();

        for (int i = 0; i < 10; i++)
            stack.push(i);

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
