package com.inventory.structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class QueueStruct {

    private List<Map<String, Object>> items;

    public QueueStruct() {
        this.items = new ArrayList<>();
    }

    public void enqueue(Map<String, Object> item) {
        this.items.add(item);
    }

    public Map<String, Object> dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return this.items.remove(0);
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public int size() {
        return this.items.size();
    }

}

