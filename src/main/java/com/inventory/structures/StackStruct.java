package com.inventory.structures;

import com.inventory.model.Category;
import com.inventory.service.CategoryService;
import jakarta.persistence.Id;
import com.inventory.service.CategoryServiceImplementation;
import com.inventory.repository.CategoryRepository;

import java.util.Stack;


public class StackStruct extends Category {
    private int max;
    private Object[] items;
    private int front;
    private  int count;

    private CategoryService categoryService;

    public StackStruct(int max) {
        this.max = max;
        items = new Object[max];
        this.categoryService = categoryService;
    }
    public void push(Category category) {
        if (count < max) {
            items[++count] = category;
            categoryService.saveCategory(category);
        } else {
            System.out.println("stack is full");
        }
    }




}







