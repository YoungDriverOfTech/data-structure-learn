package com.data.structure.tree.binaryTree;

public interface Tree {
    Node find(int key);

    boolean insert(int key);

    boolean delete(int key);

    Node findMax();

    Node findMin();

    void showTree(Node node);

    Node getRootNode();
}
