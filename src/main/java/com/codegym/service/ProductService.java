package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
	private final List<Product> products;

	public ProductService() {
		products = new ArrayList<>();
	}

	@Override
	public List<Product> findAll() {
		return products;
	}

	@Override
	public void add(Product product) {
		products.add(product);
	}

	@Override
	public Product findById(int id) {
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		int index = products.indexOf(findById(product.getId()));
		products.set(index, product);
	}

	@Override
	public void remove(int id) {
		products.remove(findById(id));
	}
}
