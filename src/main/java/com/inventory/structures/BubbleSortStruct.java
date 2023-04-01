package com.inventory.structures;

import com.inventory.model.Category;

import java.util.List;

import static io.netty.util.internal.MathUtil.compare;

public class BubbleSortStruct {
	public static void bubbleSort(List<Category> categories) {
		int categorySize = categories.size();
		
		for (int i = 0; i < categorySize - 1; i++) {
			for (int j = 0; j < categorySize - i - 1; j++) {
				if (compare(categories.get(j), categories.get(j + 1)) > 0) {
                    			Category temp = categories.get(j);
                    			categories.set(j, categories.get(j + 1));
                    			categories.set(j + 1, temp);
                		}
			}
		}	
	}
}
