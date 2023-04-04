package com.inventory.service;

import com.inventory.model.Category;
import com.inventory.repository.CategoryRepository;
import com.inventory.structures.StackStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CategoryServiceImplementation implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	private StackStructure<Category> stackStructure = new StackStructure<>(4);

	private Queue<Category> categoryQueueStruct = new ArrayDeque<>();

	@Override
	public void saveCategory(Category category) {
		try {
			List<Category> allCategories = categoryRepository.findAll();
			int id = allCategories.isEmpty() ? 0 : allCategories.get(allCategories.size() - 1).getId();
			if (id <= 4) {
				stackStructure.push(category);
				categoryRepository.saveAll(Arrays.asList(stackStructure.pop()));
			} else if (id >= 5 && id <= 9) {
				categoryQueueStruct.add(category);
				categoryRepository.saveAll(categoryQueueStruct);
			}
		} catch(NullPointerException e) {
			throw new IllegalArgumentException("Field cannot be null");
		}
	}

	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

//	@Override
//	public Integer findById(Integer id) {
//		return categoryRepository.findById(id);
//	}

	@Override
	public void deleteById(Integer id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public Category updatedCategory(Integer id, Category category) {
		Category existingCategory = categoryRepository.findById(id).orElse(null);
		if (existingCategory != null) {
			existingCategory.setName(category.getName());
			existingCategory.setCid(category.getCid());
			existingCategory.setDescription(category.getDescription());
		}
		return existingCategory;
	}
}
