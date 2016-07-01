package com.levo.g.maps;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancements {

	public static void main(String[] args) {
		final Product defaultProduct = new Product(-1, "Whatever the customer wants", 100);
		
		final Map<Integer, Product> idToProduct = new HashMap<>();
		idToProduct.put(1, ProductFixtures.door);
		idToProduct.put(2, ProductFixtures.floorPanel);
		idToProduct.put(3, ProductFixtures.window);
		
		// demo #1: default get for replacing null value
//		Product resultGet = idToProduct.get(10);
//		Product resultDefault = idToProduct.getOrDefault(10, defaultProduct);
//		System.out.println(resultGet);
//		System.out.println(resultDefault);

		// demo #2: replace method
//		Product result = idToProduct.replace(1, new Product(1, "Big Door", 50));
//		System.out.println(result);
//		System.out.println(idToProduct.get(1));
		
		// demo #3: replace method for non-existing value will do nothing
//		Product result = idToProduct.replace(4, new Product(1, "Big Door", 50));
//		System.out.println(result);
//		System.out.println(idToProduct.get(4));
		
		// demo #4: replace method bi function lambda expr
		System.out.println(idToProduct);
		idToProduct.replaceAll( (id, oldProduct) ->
			new Product(id, oldProduct.getName(), oldProduct.getWeight() + 10)
		);
		System.out.println(idToProduct);
		System.out.println();
		
		// demo #5: computeIfAbsent method bi function lambda expr for absent
		System.out.println(idToProduct);
		Product result = idToProduct
			.computeIfAbsent(10, (id) -> new Product(id, "Custom Product", 69));
		System.out.println(result);
		System.out.println(idToProduct.get(10));
		
		// demo #6: computeIfAbsent method bi function lambda expr for existing
		System.out.println();
		result = idToProduct
			.computeIfAbsent(2, (id) -> new Product(id, "Custom Product", 69));
		System.out.println(result);
		System.out.println(idToProduct.get(2));
		System.out.println();
		
		// demo #7: for-each traverse with callback
		idToProduct.forEach( (key, value) -> {
			System.out.println(key + " -> " + value);
		});
	}

}
