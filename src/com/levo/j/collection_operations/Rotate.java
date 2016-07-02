package com.levo.j.collection_operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rotate {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(ProductFixtures.door);
		products.add(ProductFixtures.floorPanel);
		products.add(ProductFixtures.window);
		
		printProducts(products);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Rotate #" + (i+1));
			Collections.rotate(products, 1);
			printProducts(products);
		}
		
	}
	
	private static void printProducts(List<Product> products) {
		System.out.println(products);
		System.out.println();
	}
}
