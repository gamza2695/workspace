package com.kh.test.board.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.test.board.model.dto.Board;

@Mapper
public interface BoardMapper {

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

	
	/** 비밀번호 조회
	 * @param boardNo
	 * @return
	 */
	String selectBoardPw(int boardNo);
	
	/** 게시글 삭제
	 * @param boardNo
	 * @param boardPw
	 * @return result
	 */
	int deleteBoard(int boardNo);

	/** 게시글 수정
	 * @param board
	 * @return
	 */
	int updateBoard(Board board);




	
	

	
	
}
