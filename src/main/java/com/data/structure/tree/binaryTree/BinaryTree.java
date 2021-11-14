package com.data.structure.tree.binaryTree;

public class BinaryTree implements Tree{

    private Node root;

    @Override
    public Node find(int key) {
        Node current = root;
        while (current != null) {
            if (current.getData() > key) { // search leftChild tree when key is smaller than current node
                current = current.getLeftChild();
            } else if(current.getData() < key) {
                current = current.getRightChild();
            } else {
                if (!current.isDeleted) {
                    return current;
                }
            }
        }
        return null;
    }

    @Override
    public boolean insert(int key) {

        Node newNode = new Node(key);

        if (root == null) { // add newNode to root if this tree has no one node
            root = newNode;
            return true;
        } else {
            Node currentNode = root;
            Node parentNode;

            while (currentNode != null) {
                parentNode = currentNode;

                // search leftChild when key is larger than current
                if (currentNode.getData() > key) {

                    // if leftChild is null then set newNode into it
                    currentNode = currentNode.getLeftChild();   // this operation is for loop search
                    if (currentNode == null) {
                        parentNode.setLeftChild(newNode);
                        return true;
                    }
                } else if(currentNode.getData() < key) {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {
                        parentNode.setRightChild(newNode);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(int key) {
        Node node = find(key);
        if (node != null) {
            node.setDeleted(true);
            return true;
        }
        return false;
    }

    @Override
    public Node findMax() {
        Node current = root;
        Node maxNode = current;
        while (current != null) {
            maxNode = current;
            current = current.getRightChild();
        }
        return maxNode;
    }

    @Override
    public Node findMin() {
        Node current = root;
        Node minNode = current;
        while (current != null) {
            minNode = current;
            current = current.getLeftChild();
        }
        return minNode;
    }

    @Override
    public void showTree(Node node) {
        if (!node.isDeleted) {
            System.out.println(node.getData());
        }
        if (node.getLeftChild() != null) {
            showTree(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            showTree(node.getRightChild());
        }
    }

    @Override
    public Node getRootNode() {
        return this.root;
    }
}
