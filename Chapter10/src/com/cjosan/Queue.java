package com.cjosan;

/**
 * Created by admin on 19.06.2017.
 */
public class Queue {
    private int[] elements;
    private int size;

    public Queue() {
        this.elements = new int[8];
    }

    public void enqueue(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    public int dequeue() {
        int[] temp = new int[elements.length];
        int value = elements[0];
        System.arraycopy(elements, 1, temp, 0, elements.length - 1);
        elements = temp;
        size--;

        return value;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
