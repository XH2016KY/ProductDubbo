package com.product.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import com.product.core.pojo.ProductCategory;

/**
 * 
 * <h1> 商品类目mapper接口</h1>
 * @author happy everyday
 * 2018年9月28日
 */
public interface ProductCategoryMapper {
	
	/**
	 * <h2>根据商品类型id查询</h2>
	 * {@link com.product.core.pojo.ProductCategory }
	 * @param id {@link ProductCategory #getProductCategoryId()} 商品类型id
	 * @return {@link ProductCategory}} 商品类型
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
     * <h2>查询所有商品类目</h2>
     * @return {@link java.util.List<ProductCategory>}查询的商品类目集合
     */
	List<ProductCategory> findAll();
	
	/**
	 * <h2>批量添加商品类别/h2>
	 * @param categoryList  {@link java.util.List<ProductCategory>} 添加的商品类别集合
	 * @return  结果
	 */
	boolean save(@Param("categoryList")List<ProductCategory> categoryList);
	
    /**
     * <h2>更新商品类别</h2>
     * @param  {@link ProductCategory} 商品类别
     * @return  结果
     */
	boolean update(@Param("productCategory")ProductCategory productCategory);  
	
	
	
	
	
	

}
