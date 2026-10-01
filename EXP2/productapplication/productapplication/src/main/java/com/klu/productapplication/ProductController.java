package com.klu.productapplication;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	@PostMapping("/insert")
	public void insertProduct(@RequestBody Product p)
	{
		ps.insertProduct(p);
	}
	@GetMapping("/retrieve")
	public java.util.List<Product> retrieveProduct(){
		
		return ps.retrieveProduct();
	}

}
