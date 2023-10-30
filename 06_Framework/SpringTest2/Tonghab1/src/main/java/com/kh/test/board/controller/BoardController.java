package com.kh.test.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.test.board.model.dto.Board;
import com.kh.test.board.model.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BoardController {

	@Autowired
	private BoardService service;
	
	@GetMapping("searchBoard")
	public String searchBoard(String inputTitle, Model model) {
		
		List<Board> resultBoard = service.searchBoard(inputTitle);
		
		//if(resultBoard.size() != 0)
		if(!resultBoard.isEmpty()) {
			model.addAttribute("resultBoard",resultBoard);
			return "searchSuccess";
		}
		
		
		return "searchFail";
		
		
	}
	
	
}
