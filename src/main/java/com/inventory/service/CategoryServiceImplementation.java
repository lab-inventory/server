package com.inventory.service;

import com.inventory.model.Category;
import com.inventory.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CategoryServiceImplementation implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	private Stack<Category> categoryStackStruct = new Stack<Category>();
	private Queue<Category> categoryQueueStruct = new ArrayDeque<>();

	@Override
	public void saveCategory(Category category) {
		try {
			List<Category> allCategories = categoryRepository.findAll();
			int id = allCategories.isEmpty() ? 0 : allCategories.get(allCategories.size() - 1).getId();
			if (id <= 4) {
				categoryStackStruct.push(category);
				List<Category> reversedCategories = new ArrayList<>(categoryStackStruct);
				Collections.reverse(reversedCategories);
				categoryRepository.saveAll(categoryStackStruct);
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
		List<Category> categories = categoryRepository.findAll();
		int categoryId = categories.get(categories.size() - 1).getId();
		if (categoryId != 0 && categoryId <= 4)
			for (Category category : categoryStackStruct) {
				if (category.getId() == id)
					categoryStackStruct.remove(category);
					categoryRepository.deleteById(id);
					break;
		}
	}
}
