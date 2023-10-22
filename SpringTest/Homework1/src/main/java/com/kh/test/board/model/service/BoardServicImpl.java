package com.kh.test.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kh.test.board.model.dto.Board;
import com.kh.test.board.model.mapper.BoardMapper;

@Transactional
@Service
public class BoardServicImpl implements BoardService {
	
	@Autowired
	private BoardMapper mapper;

	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	
	@Override
	public List<Board> selectBoardList() {
		return mapper.selectBoardList();
	}
	
	
	@Override
	public int insert(Board board) {
		
		// 비밀번호 암호화
		String encPw = bcrypt.encode(board.getBoardPw());
		board.setBoardPw(encPw);
		
		return mapper.insert(board);
	}
	
	
	
	@Override
	public Board selectOne(int no) {
		return mapper.selectOne(no);
	}
	
	
	
	@Override
	public int deleteBoard(int boardNo, String boardPw) {
		
		// selectBoardPw쿼리로 boardNo로 조회한 비밀번호를 encPw에 저장
		String encPw =mapper.selectBoardPw(boardNo);
		
		// boardPw와 encPw 비교 -> 다르면 0 return
		if(!bcrypt.matches(boardPw, encPw)) return 0;
		
		// 같으면 deleteBoard 쿼리 실행
		return mapper.deleteBoard(boardNo);
	}
	
	
	
	@Override
	public Board moveUpdate(int boardNo, String boardPw) {
		
		// selectBoardPw쿼리로 boardNo로 조회한 비밀번호를 encPw에 저장
		String encPw =mapper.selectBoardPw(boardNo);
		
		// boardPw와 encPw 비교 -> 다르면 null 반환
		if(!bcrypt.matches(boardPw, encPw)) return null;
		
		// *** 같으면 게시글 조회 결과 반환 **** 
		return mapper.selectOne(boardNo);
	}
	
	
	
	
	@Override
	public int updateBoard(Board board) {
		
		// 비밀번호 암호화
		String encPw = bcrypt.encode(board.getBoardPw());
		board.setBoardPw(encPw);
		
		return mapper.updateBoard(board);
	}
	
	
	
}
