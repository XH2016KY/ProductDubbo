package com.product.core.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import com.product.core.pojo.Product;
import com.product.core.pojo.ProductCategory;

public interface ProductMapper {
	
	/**
	 * 通过ProductId查询商品 
	 * @param id
	 * @return
	 */
	Product findById(@Param("id")Long id);
	
	
	/**
	 * 查询Product_Category_id = 2 的商品---->查询指定商品类目下的所有商品
	 */	
	List<Product> findByCategory(@Param("category") ProductCategory category);
	
	/**
	 * 添加商品
	 * @param product
	 * @return
	 */
	boolean save(@Param("productList")List<Product> productList);
	
	boolean update(@Param("product")Product product);

	@Select(value = "select * from product")
	@Results({
		@Result(property="productId",column="product_id"),
		@Result(property="productCategoryId",column="product_category_id"),
		@Result(property="productName",column="product_name"), 		 
		@Result(property="productImg",column="product_img"),
		@Result(property="productPrice",column="product_price"),
		@Result(property="productStock",column="product_stock"),
		@Result(property="productStatus",column="product_status"),
		@Result(property="updateTime",column="update_time"),
		@Result(property="createTime",column="create_time")   		 
	})
	List<Product> findAll();
	
	
}
