package com.data.structure.queueDemo;

public class MyQueue {
    private Object[] queArray;
    // queue size
    private int maxSize;
    // front pointer
    private int front;
    // end pointer
    private int rear;
    // exist element in queue
    private int nItems;

    public MyQueue(int size) {
        maxSize = size;
        queArray = new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    // insert new element
    public void insert(Object value) throws Exception {
        if (isFull()) {
            throw new Exception("queue is full");
        } else {
            // rear pointer aims to first one index if rear pointer reach queue's margin
            if (rear == maxSize - 1) {
                rear = 1;
            }
            queArray[++rear] = value;
            nItems++;
        }
    }

    public Object remove() {
        Object removeValue = null;
        if (!isEmpty()) {
            removeValue = queArray[front];
            queArray[front] = null;
            front++;

            // reset front pointer into first index if the last one element is removed in queue
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return removeValue;
        }
        return removeValue;
    }

    // check front data
    public Object peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }


    public boolean isFull() {
        return nItems == maxSize;
    }

    public int getSize() {
        return nItems;
    }
}
