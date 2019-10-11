package com.zensar.sevices;

import java.util.List;

import com.zensar.entities.Product;

/**
 * @author Susmita Basak
 * @creation_date 4th Oct 2019 11.44pm
 * @modification_date 10th Oct 2019 5.44pm
 * @version 3.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a Product Service Class using Business Layer.
 *
 */
public interface ProductService {
	List<Product> findAllProducts();

	Product findProductById(int productId);

	void addProduct(Product product);

	void updateProduct(Product product);

	void removeProduct(Product product);

	List<Product> findProductByPriceRange(float minPrice,float maxPrice);

	List<Product> findProductByName(String name);

	List<Product> findProductByBrand(String brand);

	Long getProductCount();

}
