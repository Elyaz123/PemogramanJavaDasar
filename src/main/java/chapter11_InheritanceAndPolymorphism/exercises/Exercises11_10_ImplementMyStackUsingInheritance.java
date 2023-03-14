package chapter11_InheritanceAndPolymorphism.exercises;

import java.util.Scanner;

public class Exercises11_10_ImplementMyStackUsingInheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();

        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        System.out.println("Stack: " + stack.toString());
    }
}

class MyStack
        extends java.util.ArrayList {
    private java.util.ArrayList<Object> list;

    public MyStack() {
        list = new java.util.ArrayList<Object>();
    }

    public void push(Object o) {
        list.add(0, o);
    }

    public Object peek() {
        return list.get(0);
    }

    public Object pop() {
        Object o = list.get(0);
        list.remove(0);
        return o;
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}