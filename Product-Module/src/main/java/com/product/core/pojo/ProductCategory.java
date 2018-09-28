package com.product.core.pojo;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * <h1>商品类型实体</h1>
 * 
 * @author happy everyday
 * 2018年9月28日
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductCategory implements Serializable {
	
    /**
     * 商品类目
     */
    private Integer productCategoryId;

    /**
     * 商品类目名称
     */
    private String productCategoryName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
    	return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}