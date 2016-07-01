package com.levo.g.maps;

import java.util.HashMap;
import java.util.Map;

public class MapProductLookupTable implements ProductLookupTable {
	
	private final Map<Integer, Product> idToProducts = new HashMap<>();
	
	@Override
	public void addProduct(Product productToAdd) {
		final int id = productToAdd.getId();
		if(idToProducts.containsKey(id)) {
			throw new IllegalArgumentException("Unable to add product, duplicate id for" + productToAdd.getId() + ":" + productToAdd);
		}
		
		idToProducts.put(id, productToAdd);
	}

	@Override
	public Product lookupById(int id) {
		return idToProducts.get(id);
	}

	@Override
	public void clear() {
		idToProducts.clear();
	}

}
