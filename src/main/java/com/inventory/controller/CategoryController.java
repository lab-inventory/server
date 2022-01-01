package com.inventory.controller;

import com.inventory.model.Category;
import com.inventory.model.Product;
import com.inventory.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

//	get all categories
	@GetMapping("/categories")
	public List<Category> getAllCategories() {
		return categoryService.getAllCategories();
	}

//	create new category
	@PostMapping("/create-category")
	public String createCategory(@RequestBody Category category) {
		categoryService.saveCategory(category);
		return "new category added";
	}

	@GetMapping("/get/{id}")
	public String getCategory(@PathVariable("identity") Integer id) {
		return categoryService.findById(id).get();
	}

	@DeleteMapping("/delete-category/{id}")
	public boolean deleteCategory(@PathVariable("id") Integer id) {
		if (!categoryService.findById(id).equals(Optional.empty())) {
			categoryService.deleteById(id);
			return true;
		}
		return false;
	}
}