package com.levo.j.collection_utilities;

import java.util.Comparator;
import java.util.Objects;

public class Product {
	
	public static final Comparator<Product> BY_NAME =
			new Comparator<Product>() {
				@Override
				public int compare(final Product p1, final Product p2) {
					return p1.getName().compareTo(p2.getName());
			}
		};
	
	public static final Comparator<Product> BY_WEIGHT =
		new Comparator<Product>() {
			@Override
			public int compare(final Product p1, final Product p2) {
				return Integer.compare(p1.getWeight(), p2.getWeight());
		}
	};
	
//	public static final Comparator<Product> BY_NAME =
//			Comparator.comparing(Product::getName);
	
//	public static final Comparator<Product> BY_WEIGHT =
//		Comparator.comparing(Product::getWeight);
	
	private final String name;
	private final int weight;
	
	public Product(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return "Product{" +
			"name='" + name + "'" +
			", weight=" + weight + '}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;
		
		Product product = (Product) obj;
		
		return Objects.equals(name, product.name);
	}

//	@Override
//	public int hashCode() {
//		int result = name != null ? name.hashCode() : 0;
//		result = 31 * result + weight;
//		
//		return result;
//	}
//
//	@Override
//	public boolean equals(final Object o) {
//		if (this == o)
//			return true;
//		if (o == null || getClass() != o.getClass())
//			return false;
//		
//		final Product product = (Product) o;
//		
//		if (weight != product.weight)
//			return false;
//		
//		return !(name != null ? !name.equals(product.name) : product.name != null);
//	}
	
}
