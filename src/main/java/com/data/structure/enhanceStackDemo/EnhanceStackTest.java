package com.data.structure.enhanceStackDemo;

public class EnhanceStackTest {
    public static void main(String[] args) {
        EnhanceStack stack = new EnhanceStack(4);
        stack.push(1);
        //System.out.println(stack.peek());
        stack.push(2);
        stack.push(3);
        stack.push("abc");
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }
}