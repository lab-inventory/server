package com.inventory.structures;

import com.inventory.model.Category;
import com.inventory.InventoryApplication;
import com.inventory.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Stack;


public class StackStruct extends Category {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sql_inventory?useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD ="password";


    public static void main(String[] args){

        CategoryRepository categoryRepository = null;

        //create a new category object
        Category category = new Category();
        category.setName("Beverages");
        category.setId(1);
        category.setDescription("Drinks");

        //category1 object
        Category category1 = new Category();
        category1.setName("Bakery");
        category1.setId(2);
        category1.setDescription("Baked snacks");


        //category2 object
        Category category2 = new Category();
        category2.setName("Canned Goods");
        category2.setId(3);
        category2.setDescription("Canned products");


        //category3 object
        Category category3 = new Category();
        category3.setName("Dairy");
        category3.setId(4);
        category3.setDescription("Dairy products");

        //create new stack and add the category to it
        Stack<Category> stack = new Stack<Category>();

        //stack push method
        stack.addElement(category);
        stack.push(category);
        stack.push(category1);
        stack.push(category2);
        stack.push(category3);


        //save category to database
        categoryRepository.save(category);
        categoryRepository.save(category1);
        categoryRepository.save(category3);
        categoryRepository.save(category2);

        //Connect to thr database and add stack items
        try(Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO categories (name) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            //save all the items in the stack to the database
            while (!stack.isEmpty()) {
                Category item = stack.pop();
                categoryRepository.save(item);
            }

            System.out.println("Categories added to the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //retrieve the top item from the stack without removing it
        Category topItem = stack.peek();

        // check if the stack is empty
        boolean empty = stack.isEmpty();

    }
}
