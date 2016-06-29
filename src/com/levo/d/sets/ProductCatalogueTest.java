package com.levo.d.sets;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;
import org.junit.Test;

import static com.levo.d.sets.ProductFixtures.*;

public class ProductCatalogueTest {

	@Test
	public void shouldOnlyHoldUniqueProducts() throws Exception {
		ProductCatalogue catalogue = new ProductCatalogue();
		
		catalogue.isSuppliedBy(bobs);
		catalogue.isSuppliedBy(kates);
		
		assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));
	}
	
	@Test
	public void shouldFindLightVanProducts() throws Exception {
		ProductCatalogue catalogue = new ProductCatalogue();
		
		catalogue.isSuppliedBy(bobs);
		catalogue.isSuppliedBy(kates);
		
		assertThat(catalogue.lightVanProducts(), containsInAnyOrder(window));
	}
	
	@Test
	public void shouldFindHeavyVanProducts() throws Exception {
		ProductCatalogue catalogue = new ProductCatalogue();
		
		catalogue.isSuppliedBy(bobs);
		catalogue.isSuppliedBy(kates);
		
		assertThat(catalogue.heavyVanProducts(), containsInAnyOrder(door, floorPanel));
	}

}
