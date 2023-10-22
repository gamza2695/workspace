package com.kh.test.board.model.service;

import java.util.List;

import com.kh.test.board.model.dto.Board;

public interface BoardService {

	
	/** 게시글 목록 조회
	 * @return boardList
	 */
	List<Board> selectBoardList();

	
	/** 게시글 등록
	 * @param board
	 * @return result
	 */
	int insert(Board board);

	
	/** 게시글 조회
	 * @param no
	 * @return board
	 */
	Board selectOne(int no);


	/** 게시글 삭제
	 * @param boardNo
	 * @param boardPw
	 * @return result
	 */
	int deleteBoard(int boardNo, String boardPw);


	/** 수정화면 이동
	 * @param boardNo
	 * @param boardPw
	 * @return board
	 */
	Board moveUpdate(int boardNo, String boardPw);


	/** 게시글 수정
	 * @param board
	 * @return result
	 */
	int updateBoard(Board board);



}
