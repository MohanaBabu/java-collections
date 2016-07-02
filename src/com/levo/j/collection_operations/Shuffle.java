package com.levo.j.collection_operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(ProductFixtures.door);
		products.add(ProductFixtures.floorPanel);
		products.add(ProductFixtures.window);
		
		printProducts(products);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Shuffle #" + (i+1));
			Collections.shuffle(products);
			printProducts(products);
		}
		
	}
	
	private static void printProducts(List<Product> products) {
		System.out.println(products);
		System.out.println();
	}
}
