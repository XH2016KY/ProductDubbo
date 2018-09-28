package com.product.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.product.core.api.ProductCategoryApi;
import com.product.core.mapper.ProductCategoryMapper;
import com.product.core.message.MessageSender;
import com.product.core.pojo.ProductCategory;

@Service("productCategoryServiceImpl")
public class ProductCategoryServiceImpl implements ProductCategoryApi{

	@Autowired
	private ProductCategoryMapper productCategoryMapper;
	
	@Autowired
	private MessageSender messageSender;
	
	@Override
	public ProductCategory findById(Integer id) {
		
		return this.productCategoryMapper.findById(id);
	}

	@Override
	public List<ProductCategory> findAll() {
	
		return this.productCategoryMapper.findAll();
	}
   
	/**
	 *  数据库添加成功时
	 *  数据同步到ElasticSearch
	 */
	@Transactional
	@Override
	public boolean save(List<ProductCategory> categoryList) {  
		
		Boolean ok = null; 
		try {
			// 数据库操作
			ok = productCategoryMapper.save(categoryList);
			if(ok == true) {
				// TODO 数据一致性 || 注意指令重排
				messageSender.send(categoryList);
			 }
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	    	
		
	}

	@Transactional
	@Override
	public boolean updat(ProductCategory productCategory) {
	 
		return this.productCategoryMapper.update(productCategory);
	}
	
	

}
