package com.data.structure.enhanceStackDemo;

public class EnhanceStackTest {
    public static void main(String[] args) {
        EnhanceStack stack = new EnhanceStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push("abc");
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());

    }
}
