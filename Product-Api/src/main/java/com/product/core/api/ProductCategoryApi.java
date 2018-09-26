package com.product.core.api;

import java.util.List;

import com.product.core.pojo.ProductCategory;

public interface ProductCategoryApi {
	
	ProductCategory findById(Integer id);
	
	List<ProductCategory> findAll();
	
	boolean save(List<ProductCategory>productCategoryList);
	
	boolean updat(ProductCategory productCategory);

}
