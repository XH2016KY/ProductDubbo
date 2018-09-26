package com.product.core.api;

import java.util.List;
import com.product.core.pojo.Product;
import com.product.core.pojo.ProductCategory;

public interface ProductApi  {
	
	List<Product> findAll();
	
	List<Product> findByCategory(ProductCategory category);
	
	Product findById(Long id);
	
	boolean save(List<Product> productList);
	
	boolean update(Product product);
	
	boolean delete(Product product);

}
