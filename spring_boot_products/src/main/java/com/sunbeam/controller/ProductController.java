package com.sunbeam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunbeam.entities.Product;
import com.sunbeam.services.ProductServices;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	//add dependency
	@Autowired
	private ProductServices productService;
	
	public ProductController() {
		System.out.println("inside ProductController!");
		// TODO Auto-generated constructor stub
	}
	
	//add method to show the list of products
	@GetMapping("/list")
	public String ShowAllProducts(Model map) {
		List<Product> product=productService.productList();
		map.addAttribute("proList", product);
		return "/products/list";
	}
	
	//add method that can purchase a product
	@GetMapping("/purchase")
	public String productById(@RequestParam Long id,Model map) {
		List<Product> product= productService.productById(id);
		map.addAttribute("product", product);
		return "/products/purchase";
	}
	
	@PostMapping("/purchase")
	public String purchaseProduct() {
		return "/products/purchase";
	}
}
