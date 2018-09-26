package com.product.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.core.api.ProductCategoryApi;
import com.product.core.mapper.ProductCategoryMapper;
import com.product.core.pojo.ProductCategory;

@Service("productCategoryServiceImpl")
public class ProductCategoryServiceImpl implements ProductCategoryApi{

	@Autowired
	private ProductCategoryMapper productCategoryMapper;
	
	@Override
	public ProductCategory findById(Integer id) {
		
		return this.productCategoryMapper.findById(id);
	}

	@Override
	public List<ProductCategory> findAll() {
	
		return this.productCategoryMapper.findAll();
	}

	@Transactional
	@Override
	public boolean save(List<ProductCategory> categoryList) {
	   
		return this.productCategoryMapper.save(categoryList);
	}

	@Transactional
	@Override
	public boolean updat(ProductCategory productCategory) {
	 
		return this.productCategoryMapper.update(productCategory);
	}
	
	

}
