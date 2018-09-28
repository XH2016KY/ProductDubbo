package com.product.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.product.core.api.ProductCategoryApi;
import com.product.core.pojo.ProductCategory;

@Controller
@RequestMapping(produces = "application/json;charset=utf-8")
public class ProductCategoryController {

	@Autowired
	private ProductCategoryApi productCategoryApi;
	
	@PostMapping(value = "/productCategoryMQ")
	@ResponseBody
	public String save(@RequestBody List<ProductCategory> productCategoryList) {
		
		boolean save = productCategoryApi.save(productCategoryList);
		
		return "成功";
	}
}
