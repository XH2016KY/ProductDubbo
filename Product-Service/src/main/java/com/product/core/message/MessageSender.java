package com.product.core.message;

import java.util.List;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.product.core.pojo.ProductCategory;

/**
 * 
 * <h1>消息发送者</h1>
 * 
 * @author happy everyday
 * 2018年9月28日
 */
@Component
public class MessageSender {
    
	/**
	 * <h2>入住rabbitMQ<h2>
	 */
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	/**
	 * <h2>批量写入数据 </h2>
	 * @param {@link java.util.List<ProductCategory>} 传入的商品类别集合
	 */
	public void send(List<ProductCategory> productCategoryList) {
		
		System.out.println("hello"+productCategoryList);
		
		this.rabbitTemplate.convertAndSend("prodcutCategory",productCategoryList);
		
	}
}
