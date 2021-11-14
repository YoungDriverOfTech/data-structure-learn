package com.data.structure.linkedListDemo.singleLinkedList;

public class SingleLinkedList {
    private int size; // LinkedList size
    private Node head; // head node

    public SingleLinkedList() {
        this.size = 0;
        this.head = null;
    }

    // add node in list head
    public Object addHead(Object obj) {
        Node newHead = new Node(obj);
        if (size != 0) {
            newHead.setNext(head);
        }
        this.head = newHead;
        size++;
        return newHead;
    }

    // delete node in list head
    public Object deleteHead() {
        if (size != 0) {
            Node newHead = this.head.getNext(); // this newHead is actually the second one node in LinkedList, and it will be the first one after delete operation
            Object oldHeadData = this.head.getData(); // the old head data
            this.head.setNext(null);
            this.head = newHead;
            size--;
            return oldHeadData;
        } else {
            return null;
        }
    }

    // find specified node and return if exists, otherwise return null
    public Node find(Node node) {
        Node currentNode = this.head;
        int tempSize = this.size;

        while (tempSize > 0) {
            if (node == currentNode) {
                return currentNode;
            } else {
                currentNode = currentNode.getNext();
            }
            tempSize--;
        }
        return null;
    }

    // delete specified node
    public boolean delete(Node node) {
        if (size == 0) {
            return false;
        }

        // find parameter node's previous node
        Node current = head;
        Node previous = head;
        while (current.getData() != node.getData()) {
            if (current.getNext() == null) {
                return false;
            } else {
                previous = current;
                current = current.getNext();
            }

            if (current == head) {
                head = current.getNext();
            } else {
                previous.setNext(current.getNext());
                size--;
            }
        }
        return true;
    }
}
