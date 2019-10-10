package com.zensar.sevices;

import java.util.ArrayList;
/**
 * @author Susmita Basak
 * @creation_date 4th Oct 2019 10.44pm
 * @modification_date 10th Oct 2019 5.44pm
 * @version 3.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a Product Dao Class using Business Layer.
 *
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.ProductDao;
import com.zensar.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAll();
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return productDao.getById(productId);
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.insert(product);

	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.update(product);

	}

	@Override
	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.delete(product);

	}

	@Override
	public List<Product> findProductByPriceRange(float minPrice, float maxPrice) {
		// TODO Auto-generated method stub

		List<Product> l = productDao.getAll();
		List<Product> filterByPrice = new ArrayList<>();
		for (Product product : l) {
			if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
				filterByPrice.add(product);

			}
		}
		return filterByPrice;
	}

	@Override
	public List<Product> findProductByName(String name) {
		// TODO Auto-generated method stub

		List<Product> n = productDao.getAll();
		List<Product> filterByName = new ArrayList<>();
		for (Product product : n)
			filterByName.add(product);

		return filterByName;
	}

	@Override
	public List<Product> findProductByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Product> b = productDao.getAll();
		List<Product> filterByBrand = new ArrayList<>();
		for (Product product : b)
			filterByBrand.add(product);

		return filterByBrand;
	}

	@Override
	public Long getProductCount() {
		long count = 0;
		List<Product> c = productDao.getAll();
		for (Product product : c) {
			count++;
		}

		return count;
		// TODO Auto-generated method stub

	}

}
