package com.inventory.controller;

import com.inventory.model.Category;
import com.inventory.service.CategoryService;
import com.inventory.structures.StackStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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

//	@GetMapping("/get/{id}")
//	public Integer getCategory(@PathVariable("identity") Integer id) {
//		return categoryService.findById(id);
//	}

//	@DeleteMapping("/delete-category/{id}")
//	public boolean deleteCategory(@PathVariable("id") Integer id) {
//		if (!categoryService.findById(id).equals(Optional.empty())) {
//			categoryService.deleteById(id);
//			return true;
//		}
//		return false;
//	}
}
