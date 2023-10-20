package com.kh.test.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import com.kh.test.customer.model.dto.Customer;
import com.kh.test.customer.model.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("addCustomer")
	public String addCustomer(Customer inputCustomer) {
		
		int result = service.addCustomer(inputCustomer);
		
		// 성공
		if(result > 0) {
			return "result"; 
		}
		return null;		
	}
}
