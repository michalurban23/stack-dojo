package com.codecool.michalurban.stack;

import com.codecool.michalurban.exception.StackOverflowException;
import com.codecool.michalurban.exception.StackUnderflowException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack;

    @BeforeEach
    void setup() {

        this.stack = new Stack(10);
    }

    private void fillWithSomeData() {

        stack.push("Ala");
        stack.push("ma");
        stack.push("kota.");
        stack.push("Zosia");
        stack.push("ma");
        stack.push("psa.");
    }

    @Test
    void testConstructorWithPositiveSizeParameter() {

        assertAll(() -> assertNotNull(stack),
                  () -> assertEquals(10, stack.size()));
    }

    @Test
    void testConstructorWithNegativeSizeParameter() {

        int negative = -1;
        assertThrows(IllegalArgumentException.class, () -> new Stack(negative));
    }

    @Test
    void testPushOnEmptyStack() {

        stack.push(new Object());

        assertEquals(1, stack.size());
    }

    @Test
    void testPushOnFullStack() {

        for (int i = 0; i < stack.size(); i++) {
            stack.push(new Object());
        }

        assertThrows(StackOverflowException.class, () -> stack.push(new Object()));
    }

    @Test
    void testPopReturnsLastPushObject() {

        fillWithSomeData();

        Object testObject = new Object();
        stack.push(testObject);

        assertEquals(testObject, stack.pop());
    }

    @Test
    void testPopOnEmptyStack() {

        assertThrows(StackUnderflowException.class, () -> stack.pop());
    }

    @Test
    void testPopOnFullStack() {

        for (int i = 0; i < stack.size(); i++) {
            stack.push(new Object());
        }
        stack.pop();

        assertEquals(9, stack.size());
    }

    @Test
    void test() {


    }

}