package com.product.core.mapper;

import java.util.Date;
import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.product.core.api.ProductCategoryApi;
import com.product.core.message.MessageSender;
import com.product.core.pojo.ProductCategory;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryTest {

	@Autowired
	private ProductCategoryMapper productCategoryMapper;
	@Autowired
	private MessageSender messageSender;
	@Autowired
	private ProductCategoryApi productCategoryApi;
	
	@Test
	public void findAllCategory() {
		List<ProductCategory> findAll = this.productCategoryMapper.findAll();
		log.info("结果:{}",findAll);
	}
	
	@Test
	public void findById() {
		ProductCategory findById = productCategoryMapper.findById(new Integer(1));
		System.out.println(findById);
	}
	
	@Test
	public void save() {
		ProductCategory p = ProductCategory.builder()
				.productCategoryName("中间件RabbitMQ111222")
				.createTime(new Date())
				.updateTime(new Date())
				.build();
	
		List<ProductCategory> categoryList = Lists.newArrayList();
		categoryList.add(p);
		boolean flag = this.productCategoryApi.save(categoryList);
		log.info("结果:{}",flag);
	}
	
	@Test
	public void update() {
		ProductCategory p = ProductCategory.builder()
				.productCategoryId(3)
				.productCategoryName("中间件111")
				.updateTime(new Date())
				.build();
		boolean update = this.productCategoryMapper.update(p);
		log.info("结果:{}",update);
	}
	
	@Test
	public void send() {
		ProductCategory p = ProductCategory.builder()
				.productCategoryId(105)
				.productCategoryName("Reis集群安装服务5")
				.createTime(new Date())
				.updateTime(new Date())
				.build();
		ProductCategory p3 = ProductCategory.builder()
				.productCategoryId(106)
				.productCategoryName("Reis集群安装服务6")
				.createTime(new Date())
				.updateTime(new Date())
				.build();
		ProductCategory p1= ProductCategory.builder()
				.productCategoryId(108)
				.productCategoryName("Reis集群安装服务8")
				.createTime(new Date())
				.updateTime(new Date())
				.build();
		ProductCategory p2 = ProductCategory.builder()
				.productCategoryId(109)
				.productCategoryName("Reis集群安装服务4")
				.createTime(new Date())
				.updateTime(new Date())
				.build();
		List<ProductCategory> categoryList = Lists.newArrayList();
		categoryList.add(p1);categoryList.add(p2);
		categoryList.add(p);categoryList.add(p3);
		messageSender.send(categoryList);
	}
}
