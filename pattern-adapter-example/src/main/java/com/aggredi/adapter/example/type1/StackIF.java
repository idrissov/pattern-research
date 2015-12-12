package com.aggredi.adapter.example.type1;

/**
 * Created by Serik Idrissov
 * Interface to work with list collections as a stack
 */
public interface StackIF <T> {

    /**
     * Method to get element from stack
     * and remove it element from stack.
     *
     * @return Most last added element or null when stack is empty
     */
    T pop();

    /**
     * Add element to stack
     *
     * @param element element to add
     */
    void push(T element);

}
