package com.dv.dscatalog.tests;

import java.time.Instant;

import com.dv.dscatalog.dto.ProductDTO;
import com.dv.dscatalog.entity.Category;
import com.dv.dscatalog.entity.Product;

public class Factory {

	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "Good Phone", 800.0, "https://img.com/img.png", Instant.parse("2020-10-20T03:00:00Z"));
		product.getCategories().add(createCategory());
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
	
	public static Category createCategory() {
		return new Category(2L, "Electronics");
	}
	
}
