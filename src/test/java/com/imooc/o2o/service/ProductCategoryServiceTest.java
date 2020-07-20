package com.imooc.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.ProductCategory;

public class ProductCategoryServiceTest extends BaseTest {
	@Autowired
	private ProductCategoryService productCategoryService; 
	
	@Test
	public void testProductCategory() {
		List<ProductCategory> productCategoryList = new ArrayList<ProductCategory>();
		productCategoryList = productCategoryService.getProductCategoryList(1L);
		assertEquals(3, productCategoryList.size());
		System.out.println(productCategoryList.get(0).getProductCategoryName());
	}
	
	
}
