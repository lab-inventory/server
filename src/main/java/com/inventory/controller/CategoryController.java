package com.inventory.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inventory.model.Category;
import com.inventory.model.Product;
import com.inventory.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.DataInput;
import java.io.IOException;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/category")
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
		ObjectMapper objectMapper = new ObjectMapper();
		DataInput jsonString = null;
		try {
			System.out.println(objectMapper.readValue(jsonString, Category.class));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		categoryService.saveCategory(category);
		return "new category added";
	}
}
