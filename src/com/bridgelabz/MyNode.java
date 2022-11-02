package com.bridgelabz;

public class MyNode<T> {
    private T key;

    // K,V

    private MyNode<T> next;

    public MyNode(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }
}
