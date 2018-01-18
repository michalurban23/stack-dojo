package com.codecool.michalurban.stack;

import com.codecool.michalurban.exception.StackOverflowException;
import com.codecool.michalurban.exception.StackUnderflowException;

public class Stack {

    private Object[] data;
    private int elements;

    public Stack(int size) {

        if (size < 0) {
            throw new IllegalArgumentException("Argument cant be negative");
        }
        this.data = new Object[size];
        this.elements = 0;
    }

    public void push(Object o) {

        if (elements == data.length) {
            throw new StackOverflowException("Stack is full.");
        } else {
            data[elements++] = o;
        }
    }

    public Object pop() {

        if (elements == 0) {
            throw new StackUnderflowException("Stack is empty.");
        } else {
            return data[--elements];
        }
    }

    public Object peek() {

        return data[elements-1];
    }

    public int size() {

        return this.data.length;
    }

    public int getAvailableSpace() {

        return this.size() - elements;
    }

}
