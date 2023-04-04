package com.inventory.structures;

import org.json.JSONObject;

public class StackStruct {
    private int maxSize;
    private JSONObject[] stackArray;
    private int top;

    public StackStruct(int size) {
        maxSize = size;
        stackArray = new JSONObject[maxSize];
        top = -1;
    }

    public void push(JSONObject item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stackArray[top] = item;
    }

    public JSONObject pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        JSONObject item = stackArray[top];
        top--;
        return item;
    }

    public JSONObject peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
