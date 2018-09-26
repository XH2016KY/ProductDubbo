package com.product.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.product.core.pojo.ProductCategory;

public interface ProductCategoryMapper {
	/**
	 * 根据商品类目productCategoryId查询
	 * @param id
	 * @return
	 */
	@Select(value="select * "
			         + "from product_category where product_category_id = #{id}")
	@Results({
		@Result(property="productCategoryName",column="product_category_name"),
		@Result(property="productCategoryId",column="product_category_id"),
		@Result(property="createTime",column="create_time"),
		@Result(property="updateTime",column="update_time")
	})
	ProductCategory findById(@Param("id")Integer id);
	
	/**
	 * 查询所有商品类目
	 * @return
	 */
	List<ProductCategory> findAll();
	
	/**
	 * 新增商品类目
	 * @param categoryList
	 * @return
	 */
	boolean save(@Param("categoryList")List<ProductCategory> categoryList);
	
	/**
	 * 更新商品类目
	 * @param category
	 * @return
	 */
	boolean update(@Param("productCategory")ProductCategory productCategory);  
	
	
	
	
	
	

}
