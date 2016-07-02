package com.levo.j.collection_factories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingBasket {
	
	private final List<Product> items = new ArrayList<>();
	private int totalWeight = 0;
	
	public void add(Product product) {
		items.add(product);
		totalWeight += product.getWeight();
	}
	
	public List<Product> getItems() {
		return Collections.unmodifiableList(items);		// protection, list can't be modified
	}
	
	@Override
	public String toString() {
		return "Shopping Basket of \n" + items + "\nwith weight: " + totalWeight;
	}
	
	public static void main(String[] args) {
		ShoppingBasket basket = new ShoppingBasket();
		basket.add(ProductFixtures.door);
		System.out.println(basket);
		
//		basket.getItems().add(ProductFixtures.window);	// Collection is protected !
		// Unmodifiable but Mutable elements : Unmodifiablity vs. Immutability
		basket.add(ProductFixtures.window);				// can only add with this loc
		System.out.println(basket);
	}
	
}
