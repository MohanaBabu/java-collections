package com.levo.j.collection_utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utilities {
	
	public static void main(String[] args) {
		Product door = ProductFixtures.door;
		Product floorPanel = ProductFixtures.floorPanel;
		Product window = ProductFixtures.window;
		
		List<Product> products = new ArrayList<>();
//		products.add(door);
//		products.add(floorPanel);
//		products.add(window);
		
		// Use Collections utility methods 
		
		// Collection Method #1 : addAll
		Collections.addAll(products, door, floorPanel, window);
		
		products.forEach( (prod) -> {
			System.out.println(prod);
		});
		
		System.out.println();
		
		// Collection Method #2 : min
		final Product minNameProd = Collections.min(products, Product.BY_NAME);
		System.out.println("Minimum Product (By Name)   : " + minNameProd);
		
		final Product minWeightProd = Collections.min(products, Product.BY_WEIGHT);
		System.out.println("Minimum Product (By Weight) : " + minWeightProd);
		
		System.out.println();
		
		// Collection Method #3 : max
		final Product maxNameProd = Collections.max(products, Product.BY_NAME);
		System.out.println("Maximum Product (By Name)   : " + maxNameProd);
		
		final Product maxWeightProd = Collections.max(products, Product.BY_WEIGHT);
		System.out.println("Maximum Product (By Weight) : " + maxWeightProd);
	}
	
}
