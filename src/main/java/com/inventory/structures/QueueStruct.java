package com.inventory.structures;

import com.inventory.model.Category;
import com.inventory.service.CategoryService;
import jakarta.persistence.Id;
import com.inventory.service.CategoryServiceImplementation;
import com.inventory.repository.CategoryRepository;

import java.util.LinkedList;
import  java.util.Queue;


public class QueueStruct {
    private int max;

    private CategoryService categoryService;


    private Queue<Category> categoryQueue;


        private int capacity;
        private Category[] items;
        private int front;
        private  int rear;
        private int size;
        private CategoryRepository categoryRepository;

    public QueueStruct(int capacity) {
            this.capacity = capacity;
            this.items = new Category[capacity];
        this.front = 0;
            this.rear = -1;
            this.size = 0;
        }
        public void enqueue(Category category) {
            if (isFull()) {

                throw new IllegalStateException("Queue is full");
            }else {
                rear = (rear + 1) % capacity;
                items[rear] = category;
                size++;
                QueueStruct queue = new QueueStruct(5);
                category.setCategoryName("Beverages");
                category.setCategoryId(1);
                category.setDescription("All kinds of beverages but no coffee available at the moment");
                queue.enqueue(category);


            }

        }


        public Category dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            Category category = items[front];
            items[front] = null;
            front = (front + 1) % capacity;
            size--;
            categoryRepository.deleteCategory(category);
            return category;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public int size() {
            return size;

        }
}