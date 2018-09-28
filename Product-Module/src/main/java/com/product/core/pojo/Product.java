package com.product.core.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * <h1>商品实体</h1>
 * 
 * @author happy everyday
 * 2018年9月28日
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product implements Serializable {
	
    /**
     * 商品id
     */
    private Long productId;

    /**
     * 商品名字
     */
    private String productName;

    /**
     * 商品类型
     */
    private Integer productCategoryId;

    /**
     * 商品图地址
     */
    private String productImg;

    /**
     * 商品库存
     */
    private Integer productStock;

    /**
     * 商品状态
     */
    private Byte productStatus;

    /**
     * 商品价格
     */
    private BigDecimal productPrice;

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