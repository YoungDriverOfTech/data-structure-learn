package com.data.structure.enhanceStackDemo;

import java.util.Arrays;
import java.util.EmptyStackException;

public class EnhanceStack {

    // define object array for all types data
    private Object[] elementData;
    // stack top pointer
    private int top;
    // stack size
    private int size;

    public EnhanceStack() {
        this.elementData = new Object[10];
        this.top = -1;
        this.size = 10;
    }

    public EnhanceStack(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("initial capacity can not be zero");
        }

        this.elementData = new Object[initialCapacity];
        this.top = -1;
        this.size = initialCapacity;
    }

    // push data
    public Object push(Object item) {
        // resize current stack
        resize(top + 1);
        elementData[++top] = item;
        return item;
    }

    // pop top element
    public Object pop() {
        Object obj = peek();
        remove(top);
        return obj;
    }

    // delete stack top element
    private void remove(int top) {
        elementData[top] = null;
        this.top--;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    // get stack top element
    public Object peek() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return elementData[top];
    }


    // resize this stack if necessary
    private void resize(int minCapacity) {
        int oldCapacity = size;
        // resize stack if minCapacity is greater than oldCapacity
        if (minCapacity > oldCapacity) {
            // define newCapacity
            int newCapacity = 0;
            // resize capacity two times and check if surpass Integer Max value
            if ((oldCapacity << 1) - Integer.MAX_VALUE > 0) {
                newCapacity = Integer.MAX_VALUE;
            } else {
                newCapacity = (oldCapacity << 1);
            }

            this.size = newCapacity;
            Object[] newArray = new Object[size];
            elementData = Arrays.copyOf(elementData, size);
        }
    }


}
