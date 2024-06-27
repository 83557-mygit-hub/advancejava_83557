package com.sunbeam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.entities.Product;
@Service
@Transactional
public class ProductServiceImpl implements ProductServices {
	//add dependency
	@Autowired//default--> By type
	private ProductDao productDao;
	
	public ProductServiceImpl() {
		System.out.println("inside the ProdoductService");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Product> productList() {
		List<Product> productList= productDao.findAll();
		return productList;
	}
	
	@Override
	public List<Product> productById(Long id) {
		System.out.println("inside productId");
		List<Product> product=productDao.findAllById(id);
		System.out.println(product);
		return product;
	}

}
