package com.inventory.structures;

public class ListStruct<T> {

    private Object[] elements;
    private int size;

    public ListStruct() {
        this.elements = new Object[10];
        this.size = 0;
    }

    public void add(T element) {
        if (this.size == this.elements.length) {
            Object[] newElements = new Object[this.elements.length * 2];
            for (int i = 0; i < this.size; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
        this.elements[this.size] = element;
        this.size++;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) this.elements[index];
    }

    public int size() {
        return this.size;
    }

}

