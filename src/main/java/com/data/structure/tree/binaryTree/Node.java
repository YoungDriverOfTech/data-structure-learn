package com.data.structure.tree.binaryTree;

public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;
    boolean isDeleted;

    public Node(int data) {
        this.data = data;
        this.isDeleted = false;
    }

    public void display() {
        System.out.println(data);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
