package com.inventory.structures;

import com.inventory.model.Category;
import com.inventory.InventoryApplication;
import com.inventory.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

//import java.util.Scanner;
import java.util.Stack;


public class StackStruct extends Category {

    public static void main(String[] args){

        CategoryRepository categoryRepository = null;

        //Scanner scanner = new Scanner(System.in);
        Stack<Category> stack = new Stack<Category>();

        //Populate the stack with user input
        Category category = new Category();
        category.setName("Beverages");
        category.setId(1);
        category.setDescription("Drinks");
        categoryRepository.save(category);
        stack.addElement(category);
        stack.peek();
        stack.pop();

        Category category1 = new Category();
        category1.setName("Bakery");
        category1.setId(2);
        category1.setDescription("Baked snacks");
        categoryRepository.save(category1);
        stack.addElement(category1);
        stack.peek();
        stack.pop();


        Category category2 = new Category();
        category2.setName("Canned Goods");
        category2.setId(3);
        category2.setDescription("Canned products");
        categoryRepository.save(category2);
        stack.addElement(category2);
        stack.peek();
        stack.pop();

        Category category3 = new Category();
        category3.setName("Dairy");
        category3.setId(4);
        category3.setDescription("Dairy products");
        categoryRepository.save(category3);
        stack.addElement(category3);
        stack.peek();
        stack.pop();

        //stack push
        stack.push(category);
        stack.push(category1);
        stack.push(category2);
        stack.push(category3);


    }
}
