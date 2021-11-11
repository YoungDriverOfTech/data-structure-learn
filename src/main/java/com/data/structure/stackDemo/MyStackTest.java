package com.data.structure.stackDemo;

public class MyStackTest {

    public static void main(String[] args) {
        MyStack myStack = new MyStack(3);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.peek());
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}
