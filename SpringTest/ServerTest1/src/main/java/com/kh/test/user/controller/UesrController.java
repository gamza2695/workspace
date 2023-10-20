package com.kh.test.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.test.user.model.dto.User;
import com.kh.test.user.model.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UesrController {

	@Autowired
	private UserService service;
	

	@GetMapping("selectUser")
	public String selecUser(String inputId, Model model) {
		
		User searchUser = service.selectUser(inputId);
		
		if(searchUser!= null) {
			model.addAttribute("searchUser",searchUser);
			return "searchSuccess";
		}
		else {
			return "searchFail";			
		}
	}		
}
