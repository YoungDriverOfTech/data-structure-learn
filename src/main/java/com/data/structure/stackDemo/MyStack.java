package com.data.structure.stackDemo;

public class MyStack {
    private int[] array;
    private int maxSize;
    private int top;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        top = -1;
    }

    // push data
    public void push(int value) {
        if (top < maxSize - 1) {
            top += 1;
            array[top] = value;
        }
    }

    // pop data
    public int pop() {
        int result = array[top];
        top -= 1;
        return result;
    }

    // access peek data
    public int peek() {
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top < maxSize - 1;
    }
}
