package com.klu.productapplication;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {

	@Autowired
	ProductRepo pr;
	
	@PostMapping("/insert")
	public void insertProduct(@RequestBody Product p)
	{
		pr.save(p);
	}
	public java.util.List<Product> retrieveProduct(){
		return pr.findAll(); 
	}
}
