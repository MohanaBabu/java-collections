package com.levo.j.collection_operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(ProductFixtures.door);
		products.add(ProductFixtures.floorPanel);
		products.add(ProductFixtures.window);
		
		printProducts(products);
		
		System.out.println("Sort By Name");
		Collections.sort(products, Product.BY_NAME);	// old way
//		products.sort(Product.BY_NAME);					// java8 enhancement
		printProducts(products);
		
		System.out.println("Sort By Weight");
//		Collections.sort(products, Product.BY_WEIGHT);	// old way
		products.sort(Product.BY_WEIGHT);				// java8 enhancement
		printProducts(products);
		
	}
	
	private static void printProducts(List<Product> products) {
		System.out.println(products);
		System.out.println();
	}
}
