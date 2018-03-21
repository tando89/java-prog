package com.example.stackjava;
import java.util.*;
public class myStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("number3");
        printStack(stack);
        stack.push("number2");
        printStack(stack);
        stack.push("number1");
        printStack(stack);

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
    }
    private static void printStack(Stack<String> s) {
        if (s.isEmpty()) {
            System.out.println("Nothing is in the Stack");
        } else
            System.out.printf("%s TOP\n", s);
    }
}
