/**
 * 
 */
package com.example.demo.controller;

import com.example.demo.pojo.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OrderController {
	
	
	
	@GetMapping("/order/{orderid}")
	public Order readOrder(@PathVariable Long orderid){
		//return solrOrderRepository.findByOrderid(orderid);
		Order order = new Order();
		order.setOrderid(new Long("1"));
		order.setCustomerName("Hello anur");
		order.setOrderDescription("First Order");
		order.setOrderName("Sample Order Name");
		order.setProductName("Sample Product Name");
		order.setCustomerMobile("8146000112");
		
		return order;
	}
	
	
	
}
