/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Order;



@RestController
public class OrderController {
	
	
	
	@GetMapping("/order/{orderid}")
	public Order readOrder(@PathVariable Long orderid){
		//return solrOrderRepository.findByOrderid(orderid);
		Order order = new Order();
		order.setOrderid(new Long("1"));
		order.setCustomerName("Tejinder111111");
		order.setOrderDescription("First Order");
		order.setOrderName("Sample Order Name");
		order.setProductName("Sample Product Name");
		order.setCustomerMobile("8146000112");
		
		return order;
	}
	
	
	
}
