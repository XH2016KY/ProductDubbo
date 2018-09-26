package com.product.core.mapper;

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
	@Results({
		@Result(property="productCategoryName",column="product_category_name"),
		@Result(property="productCategoryId",column="product_category_id"),
		@Result(property="createTime",column="create_time"),
		@Result(property="updateTime",column="update_time")
	})
	@Select(value="select * "
			         + "from product_category where product_category_id = #{id}")
	ProductCategory findById(@Param("id")Integer id);
	
	

}
