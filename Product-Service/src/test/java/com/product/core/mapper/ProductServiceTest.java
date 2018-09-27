package com.product.core.mapper;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.product.core.pojo.Product;
import com.product.core.pojo.ProductCategory;
import com.product.core.pojo.UserRoles;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductServiceTest {
	
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private UserRolesMapper userRolesMapper;
	
	
	@Test
	public void findById2() {
		Product findById = productMapper.findById(1L);
		System.out.println(findById);
	}
	
	
	@Test
	public void findById1() {
		List<UserRoles> findByUid = userRolesMapper.findByUid(1);
		System.out.println(findByUid);
	}
	
	@Test
	public void find() {
		long c = System.currentTimeMillis();
		ProductCategory p = ProductCategory.builder().productCategoryId(2).build();
		List<Product> productLsit = productMapper.findByCategory(p);
		log.info("结果:{}",productLsit.parallelStream().map(Product::getProductName).collect(Collectors.toList()));
		long b =System.currentTimeMillis()-c;
		log.info("用时:{}",b);
	}
	
	@Test
	public void save() {
		List<Product> productList = Lists.newArrayList();
        Product p = Product.builder()
        		.productCategoryId(1)
        		.productName("Huilder")
        		.productImg("hfahfjdfdf")
        		.productPrice(new BigDecimal(62))
        		.productStock(55)
        		.productStatus((byte)1)
        		.createTime(new Date())
        		.updateTime(new Date())
        		.build();
        productList.add(p);
        boolean flag = productMapper.save(productList);
        log.info("结果:{}",flag);
	} 
	
	@Test
	public void update() {
        Product p = Product.builder()
        		.productId(4L)
        		.productCategoryId(1)
        		.productName("Huilder")
        		.productImg("hfahfjdfdf")
        		.productPrice(new BigDecimal(62))
        		.productStock(60)
        		.productStatus((byte)1)
        		.updateTime(new Date())
        		.build();
        boolean flag = productMapper.update(p);
        log.info("结果:{}",flag);
	} 
	
	@Test
	public void findAll() {
		List<Product> findAll = productMapper.findAll();
		log.info("结果:{}",findAll);
	}
	
}
