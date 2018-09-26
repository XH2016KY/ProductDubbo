package com.product.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.product.core.api.ProductApi;
import com.product.core.mapper.ProductMapper;
import com.product.core.pojo.Product;
import com.product.core.pojo.ProductCategory;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductApi{
	
	@Autowired
	private ProductMapper productMapper;

	@Override
	public List<Product> findAll() {
	
		return productMapper.findAll();
	}

	@Override
	public List<Product> findByCategory(ProductCategory category) {
	
		return productMapper.findByCategory(category);
	}

	@Override
	public Product findById(Long id) {

		return productMapper.findById(id);
	}

	@Override
	public boolean save(List<Product> productList) {
		
		return productMapper.save(productList);
	}

	@Override
	public boolean update(Product product) {
		
		return productMapper.update(product);
	}

	@Override
	public boolean delete(Product product) {
		
		return false;
	}

}
