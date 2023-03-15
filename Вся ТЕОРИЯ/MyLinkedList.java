package com.telran.lists;

public class MyLinkedList<T> {
    private Node<T> head;

    public MyLinkedList() {
        this.head = head;
    }
    public void pushToHead(T data) {
        Node<T> node = new Node<>(data, null);
        if (head == null) {
            head = node;
        }else {
            node.setNext(head);
            head = node;
        }
    }
    public void pushToTail(T data) {
        Node<T> node = new Node<>(data, null);
        if (head == null) {
            head = node;
        }else {
            Node<T> last = getLast();
            last.setNext(node);
        }

    }
    public T removeHead() {
        T data = null;
        if (head != null) {
            data = head.getData();
            head = head.getNext();
        }
        return data;
    }
    public void removeTail() {
        if (head != null && head.getNext() != null) {
            Node<T> last = getLast();
            Node<T> preLast = head;

            while (preLast != null && preLast.getNext() != last) {
                preLast = preLast.getNext();
            }
            preLast.setNext(null);
        }else {
            head = null;
        }
    }
    public Node<T> getLast() {
        Node<T> last = head;
        while (last != null && last.getNext() != null) {
            last = last.getNext();
        }
        return last;
    }
    public void print() {
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    public T get(int i) {
        int tmp = 0;
        Node<T> node = head;
        while (node != null && node.getNext() != null && tmp != i) {
            tmp++;
            node = node.getNext();
        }
        if (tmp == i) return node.getData();
        else return null;
    }
}
