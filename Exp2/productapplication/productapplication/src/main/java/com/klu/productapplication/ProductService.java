package com.klu.productapplication;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo pr;
	
	public void insertProduct(Product p)
	{
		pr.save(p);		
	}
	
	public List<Product> retrieveProduct()
	{
		return pr.findAll();
	}
	

}
