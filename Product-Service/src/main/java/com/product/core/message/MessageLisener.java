package com.product.core.message;

import java.util.List;
import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.product.core.api.ProductCategoryApi;
import com.product.core.pojo.ProductCategory;

@Component
@RabbitListener(queues = "ok")
public class MessageLisener {
	
	@Autowired
	private ProductCategoryApi productService;
	
	@RabbitHandler
	public void process(Map<String,List<ProductCategory>>map) {
		
		System.out.println(map);
		
		// TODO 处理数据一致性
	    List<ProductCategory> list = map.get(1);
	    // TODO 从数据库批量删除缓存失败的数据
	    
		
		
		
	}

}
