package com.data.structure.tree.binaryTree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(5);
        binaryTree.insert(6);
        binaryTree.insert(3);
        binaryTree.insert(1);

        binaryTree.showTree(binaryTree.getRootNode());

        binaryTree.delete(1);
        binaryTree.showTree(binaryTree.getRootNode());
    }

    public static void print(int obj) {
        System.out.println(obj);
    }
}
