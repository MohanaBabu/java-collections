package com.levo.g.maps;

public interface ProductLookupTable {
	
	public void addProduct(final Product productToAdd);
	public Product lookupById(final int id);
	public void clear();
	
}
