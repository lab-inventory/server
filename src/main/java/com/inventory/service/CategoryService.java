package com.inventory.service;

import com.inventory.model.Category;

import java.util.List;

public interface CategoryService {
	public void saveCategory(Category category);
	public List<Category> getAllCategories();

//	public Integer findById(Integer id);

	public void deleteById(Integer id);

//	String deleteById(Integer id);
}