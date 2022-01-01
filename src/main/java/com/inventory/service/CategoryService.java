package com.inventory.service;

import com.inventory.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
	public String saveCategory(Category category);
	public List<Category> getAllCategories();

	Optional findById(Integer id);

	public String deleteById(Integer id);
}