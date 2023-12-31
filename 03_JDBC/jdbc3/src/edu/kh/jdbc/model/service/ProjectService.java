package edu.kh.jdbc.model.service;

// static 필드/메서드 호출 시 클래스명.* 에서 클래스명 생략하기 위해 static 붙임 
import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import edu.kh.jdbc.model.dao.ProjectDAO;
import edu.kh.jdbc.model.dto.Board;
import edu.kh.jdbc.model.dto.Member;

public class ProjectService {
	
	private ProjectDAO dao = new ProjectDAO();
	

	/** 회원 가입
	 * @param member
	 * @return
	 */
	public int insertMember(Member member) {
		
		// 1. 커넥션 생성
		Connection conn = getConnection();
		
		// 2. DAO 메서드 호출(Connection, 매개변수 전달)
		int result = dao.insertMember(conn, member);
		
		// 3. 트랜잭션 제어
		if(result > 0) commit(conn);
		else			rollback(conn);
		
		// 4. 커넥션 반환
		close(conn);
		
		// 5. 결과 view로 반환
			return result;
	}

	
	/** 로그인
	 * @param email
	 * @param pw
	 * @return
	 */
	public Member login(String email, String pw) {
		
		// 1. 커넥션 생성
		Connection conn = getConnection();
		
		// 2. DAO 메서드 호출
//		Member member = dao.login(conn, email, pw); // PreparedStatement
		
		Member member = dao.login2(conn, email, pw); // Statement
		
		
		
		
		// SELECT는 트랜잭션 제어 처리가 필요 없음 -> 건너뜀
		
		// 3. 커넥션 반환
		close(conn);
		
		// 4. view로 결과 반환
		
		return member;
	}
	
	
	/** Member 테이블 전체 조회
	 * @param sort
	 * @return
	 */
	public List<Member> selectAllMember(int sort){
		Connection conn = getConnection(); // 커넥션 생성
		
		// DAO 메서드 호출 후 결과 반환 받기
		List<Member> memberList = dao.selectAllMember(conn, sort);
		
		close(conn);
		
		return memberList; // 결과 반환
	}

	
	/** 회원 정보 수정
	 * @param newnick
	 * @param newtel
	 * @param memberNo
	 * @return
	 */
	public int updateMember(String newnick, String newtel, int memberNo) {
		
		Connection conn = getConnection();
		
		int result = dao.updateMember(conn, newnick, newtel, memberNo);
		
		if(result > 0) commit(conn);
		else			rollback(conn);
		
		close(conn);
		
		return result;

	}


	/** 회원 탈퇴
	 * @param memberNo
	 * @param checkPw
	 * @return
	 */
	public int updateDelFl(int memberNo, String checkPw) {
		
		Connection conn = getConnection();
		
		int result = dao.updateDelFl(conn, memberNo, checkPw);
		
		if(result > 0) commit(conn);
		else		   rollback(conn);
		
		return result;
	}


	/** 게시글 작성
	 * @param title
	 * @param content
	 * @param memberNo
	 * @return
	 */
	public int insertBoard(String title, String content, int memberNo) {
		
		Connection conn = getConnection();
		
		int result = dao.insertBoard(conn, title, content, memberNo);
		
		if(result>0) commit(conn);
		else		 rollback(conn);
		
		
		return result;
	}


	/** 게시글 전체 조회
	 * @return
	 */
	public List<Board> selectBoardList() {
		
		Connection conn = getConnection();
		
		List<Board> boardList = dao.selectBoardList(conn);
		
		close(conn);
		
		return boardList;
	}


	/** 게시글 상세 조회
	 * @param boardNo
	 * @return
	 */
	public Board selectBoard(int boardNo) {
		
		Connection conn = getConnection();
		
		// 1) DAO - 게시글 상세 조회 메서드 호출
		Board board = dao.selectBoard(conn, boardNo);
		
		// 2) 게시글 상세 조회 결과가 있을 경우 
		// -> 조회수 증가(incrementReadCount(게시글 번호)) 수행
		if(board != null) {
			int result = dao.incrementReadCount(conn, boardNo);

			// 트랜젝션 처리
			if(result > 0) {
				commit(conn);
				
				// DB와 데이터 동기화
				// (DB에서만 조회수가 1 증가하기 때문에
				// 조회해둔 board에도 조회수 1을 증가시킨다)
				board.setReadCount(board.getReadCount()+1);
			}
			else			rollback(conn);
		}
		
		close(conn);
		
		return board;
	}


	/** 게시글 체크
	 * @param memberNo
	 * @param boardNo
	 * @return
	 */
	public int checkBoard(int memberNo, int boardNo) {
		// 해당 게시글 작성 회원 번호(BOARD.MEMBER_NO)와 
		// 로그인한 회원의 회원 번호(MEMBER.MEMBER_NO)가 일치하는지 확인하는 service 메서드 호출
		
		Connection conn = getConnection();
		
		int result = dao.checkBoard(conn, memberNo, boardNo);
		
		close(conn);
		
		return result;
	}

	
	/** 게시글 삭제 여부 수정
	 * @param memberNo
	 * @param boardNo
	 * @return 
	 */
	public int updateBoardDelFl(int memberNo, int boardNo) {
		
		Connection conn = getConnection();
		
		int del = dao.updateBoardDelFl(conn, memberNo, boardNo);
		
		if(del > 0) commit(conn);
		else		   rollback(conn);
		
		close(conn);
		
		return del;
	}


	/** 게시글 수정
	 * @param memberNo
	 * @param boardNo
	 * @param newTitle
	 * @param newContent
	 * @return
	 */
	public int updateBoard(int memberNo, int boardNo, String newTitle, String newContent) {
		
		Connection conn = getConnection();
		
		int updateResult = dao.updateBoard(conn, memberNo, boardNo, newTitle, newContent);
		
		if(updateResult > 0) commit(conn);
		else				rollback(conn);
		
		close(conn);
		
		return updateResult;
	}

	
}
