package com.bhanu.springcoreadvanced.springorm1.product.dao;

import java.util.List;

import com.bhanu.springcoreadvanced.springorm1.product.entities.Product;

public interface ProductDAO {
	int create(Product product);
	int update(Product product);
	int delete(Product product);
	Product get(int id);
	List<Product> loadAll();
}
