package com.inventory.structures;

import com.inventory.model.Category;
import jakarta.persistence.Id;
import com.inventory.service.CategoryServiceImplementation;
import com.inventory.repository.CategoryRepository;

import java.util.LinkedList;
import  java.util.Queue;

public class QueueStruct {

    private CategoryRepository categoryRepository;
    private Queue<Category> categoryQueue;

    public QueueStruct() {
        CategoryRepository categoryRepository = null;
        Queue<Category> categoryQueue = new LinkedList<>();

        Category category = new Category();
        category.setCategoryName("Beverages");
        category.setCategoryId(1);
        category.setDescription("All kinds of beverages but no coffee available at the moment");
        categoryRepository.save(category);
        categoryQueue.offer(category);

    }
}