package com.inventory.structures;

import com.inventory.model.Category;
import jakarta.persistence.Id;
import com.inventory.service.CategoryServiceImplementation;
import com.inventory.repository.CategoryRepository;

import java.util.Stack;


public class StackStruct extends Category {

    public static void main(String[] args) {
        CategoryRepository categoryRepository = null;

        Stack<Category> stack = new Stack<>();
        Category category = new Category();
        category.setCategoryName("Beverages");
        category.setCategoryId(1);
        category.setDescription("All kinds of beverages but no coffee available at the moment");
        categoryRepository.save(category);
        stack.push(category);


        Category category1 = new Category();
        category1.setCategoryName("Drinks");
        category1.setCategoryId(2);
        category1.setDescription("All kinds of drinks including liquor");
        categoryRepository.save(category1);
        stack.push(category1);




    }
}







