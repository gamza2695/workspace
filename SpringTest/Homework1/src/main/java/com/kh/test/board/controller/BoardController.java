package com.kh.test.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.test.board.model.dto.Board;
import com.kh.test.board.model.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("board")
public class BoardController {

	@Autowired
	private BoardService service;
	
	
	
	
	/** 글쓰기 버튼 -> insert 페이지로 이동
	 * @return
	 */
	@GetMapping("insert")
	public String insert() {
		return "board/insert";
	}
	

	/** 게시글 등록 insert
	 * @param board
	 * @param ra
	 * @return
	 */
	@PostMapping("insert")
	public String insert(Board board, RedirectAttributes ra) {
		
		// insert 성공 시 결과 반환값을 result에 저장
		int result = service.insert(board);
		
		// 게시글 등록 성공 메인으로 리다이렉트 시 message
		if(result>0) {
			ra.addFlashAttribute("message", "등록 성공!");
		}
		
		// 메인화면으로 리턴
		return "redirect:/";
	}
		
	
	/** 게시글 조회
	 * @param no
	 * @param model
	 * @param ra
	 * @return
	 */
	@GetMapping("selectOne")
	public String selectOne(int no, Model model, RedirectAttributes ra) {
		
		// selectOne 반환 결과 board 객체에 저장
		Board board = service.selectOne(no);
		
		// board가 null이 아니면 = 값이 존재
		// board 데이터 전달, selectOne.html로 이동
		if(board!=null) {
			model.addAttribute("board", board);
			return "board/selectOne";
		}
		
		// board가 null일때 메시지 띄우고 메인화면으로 리다이렉트
		ra.addFlashAttribute("message", "게시글 조회 실패..");
		return "redirect:/";
		
	}
	
	
	/** 게시글 삭제
	 * @param boardNo
	 * @param boardPw
	 * @param ra
	 * @return
	 */
	@PostMapping("deleteBoard")
	public String deleteBoard(int boardNo, String boardPw, RedirectAttributes ra) {
		
		int result = service.deleteBoard(boardNo, boardPw);
		
		// 삭제 성공 시 메인 리다이렉트
		if(result>0) {
			ra.addFlashAttribute("message", "삭제 완료!");
			return "redirect:/";
		}
		
		// 삭제 실패 시 원래 게시글 조회 페이지로 리다이렉트 
		ra.addFlashAttribute("message", "삭제 실패..");
		return "redirect:selectOne?no=" + boardNo;
		
	}
	
	
	/** 수정 화면으로 이동
	 * @param boardNo
	 * @param boardPw
	 * @param model
	 * @param ra
	 * @return
	 */
	@PostMapping("moveUpdate")
	public String moveUpdate(int boardNo, String boardPw, Model model, RedirectAttributes ra) {
		
		// board객체에 moveUpdate 반환값을 저장
		Board board = service.moveUpdate(boardNo, boardPw);
	
		// 반환값이 존재 -> 데이터 전달 + 수정화면으로 이동
		if(board!=null) {
			model.addAttribute("board", board);
			return "board/update";
		}
		
		// 반환값이 없을 경우 원래 페이지로 리다이렉트
		ra.addFlashAttribute("message", "비밀번호가 일치하지 않습니다!");
		return  "redirect:selectOne?no=" + boardNo;
	}
	
	
	/** 게시글 수정
	 * @param board
	 * @param ra
	 * @return
	 */
	@PostMapping("updateBoard")
	public String updateBoard(Board board, RedirectAttributes ra) {
		
		// insert 성공 시 결과 반환값을 result에 저장
		int result = service.updateBoard(board);
		
		// 수정 성공
		if(result>0) {
			ra.addFlashAttribute("message", "수정 성공!");
		}
		
		// 수정 실패 - 원래 페이지로 리다이렉트
		ra.addFlashAttribute("message","수정 실패");
		return  "redirect:selectOne?no=" + board.getBoardNo();
		
	}
	
	
	
	
}
