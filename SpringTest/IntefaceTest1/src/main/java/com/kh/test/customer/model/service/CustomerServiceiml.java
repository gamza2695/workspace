package com.kh.test.customer.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kh.test.customer.model.dto.Customer;
import com.kh.test.customer.model.mapper.CustomerMapper;

@Service
@Transactional
public class CustomerServiceiml implements CustomerService {
	
	@Autowired
	private CustomerMapper mapper;
	
	@Override
	public int addCustomer(Customer inputCustomer) {
		
		return mapper.addCustomer(inputCustomer) ;
	}
}
