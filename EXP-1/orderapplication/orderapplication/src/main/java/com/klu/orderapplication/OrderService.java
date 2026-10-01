package com.klu.orderapplication;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository or;
	
	public String insert(Order o)
	{
	   or.save(o);
	   return "Order Placed Successfully";
	}
	public List<Order> retrieve()
	{
		return or.findAll();
		
	}

}
