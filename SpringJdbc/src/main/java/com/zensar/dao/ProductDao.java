package com.zensar.dao;

import java.util.List;

import com.zensar.entities.Product;

/**
 * @author Susmita Basak
 * @creation_date 4th Oct 2019 9.44pm
 * @modification_date 10th Oct 2019 4.44pm
 * @version 3.0
 * @return
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a Product Dao Interface using Persistent Layer.
 *
 */

public interface ProductDao {

	List<Product> getAll();

	Product getById(int productId);

	void insert(Product product);

	void update(Product product);

	void delete(Product product);

}
