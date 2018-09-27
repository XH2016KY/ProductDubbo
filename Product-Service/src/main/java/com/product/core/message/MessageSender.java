package com.product.core.message;

import java.util.List;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.product.core.pojo.ProductCategory;

@Component
public class MessageSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	/**
	 * 批量写入数据 
	 * @param productCategoryList
	 */
	public void send(List<ProductCategory> productCategoryList) {
		
		System.out.println("hello"+productCategoryList);
		
		this.rabbitTemplate.convertAndSend("hello",productCategoryList);
		
	}
}
