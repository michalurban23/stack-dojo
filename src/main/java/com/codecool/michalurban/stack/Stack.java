package com.codecool.michalurban.stack;

import com.codecool.michalurban.exception.StackOverflowException;
import com.codecool.michalurban.exception.StackUnderflowException;

public class Stack {

    private Object[] data;
    private int elements;

    public Stack(int size) {

        this.data = new Object[size];
        this.elements = 0;
    }

    public void push(Object o) {

        if (elements == data.length) {
            throw new StackOverflowException("Stack is full.");
        } else {
            // TODO
        }
    }

    public Object pop() {

        if (elements == 0) {
            throw new StackUnderflowException("Stack is empty.");
        } else {
            return null;// TODO
        }
    }

    public Object peek() {

        return null; // TODO
    }

    public int size() {

        return this.data.length;
    }

    public int getAvailableSpace() {

        return 0; // TODO
    }

}
