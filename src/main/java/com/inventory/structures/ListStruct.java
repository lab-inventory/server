package com.inventory.structures;

import com.inventory.model.Category;
import jakarta.persistence.Id;
import com.inventory.service.CategoryServiceImplementation;
import com.inventory.repository.CategoryRepository;

import java.util.LinkedList;
import java.util.List;
public class ListStruct {
    private List<Category> categoryList;
    private CategoryRepository categoryRepository;

    public ListStruct(){
        categoryList = new LinkedList<>();
        CategoryRepository  categoryRepository = null;

    }
    public void addCategory(Category category){

        category.setCategoryName("Beverages");
        category.setCategoryId(1);
        category.setDescription("All kinds of beverages but no coffee available at the moment");

        categoryRepository.save(category);
        categoryList.add(category);
    }

}
