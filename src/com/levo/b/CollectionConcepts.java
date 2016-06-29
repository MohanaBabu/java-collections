package com.levo.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {
	public static void main(String[] args) {
		Product door = new Product("Wooden Door", 35);
		Product floorPanel = new Product("Floor Panel", 25);
		Product window = new Product("Glass Window", 10);
		
		Collection<Product> products = new ArrayList<>();
		products.add(door);
		products.add(floorPanel);
		products.add(window);
		
//		System.out.println(products);
//		
//		final Iterator<Product> productIterator = products.iterator();
//		while(productIterator.hasNext()) {
//			Product product = productIterator.next();
//			System.out.println(product);
//		}
//		
//		for(Product product : products) {
//			System.out.println(product);
//		}
		
		final Iterator<Product> productIterator = products.iterator();
		while(productIterator.hasNext()) {
			Product product = productIterator.next();
			if(product.getWeight() > 20)
				System.out.println(product);
			else
				productIterator.remove();
		}
		
		System.out.printf("%n" + products + "%n");
		System.out.println(products.size());
		System.out.println(products.isEmpty() + "\n");
		
		System.out.println(products.contains(window));
		System.out.println(products.contains(door));
		
		Collection<Product> otherProducts = new ArrayList<>();
		otherProducts.add(window);
		otherProducts.add(door);
		
		System.out.println("*************");
		System.out.println(products);
		products.removeAll(otherProducts);
		System.out.println(products);
		
	}
}
