package edu.kh.project.myPage.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kh.project.member.model.dto.Member;
import edu.kh.project.myPage.model.dao.MyPageDAO;

// Service : 비즈니스 로직 처리(데이터 가공, DB 연결, 트랜잭션 제어)

@Service // Service 역할 + bean 등록
public class MyPageServiceImpl implements MyPageService {

	@Autowired // MyPageDAO(또는 상속 관계) bean DI(의존성 주입)
	private MyPageDAO dao;
	
	// 정상 수행 시 commit, '모든' 예외 발생 시 rollback
	@Transactional(rollbackFor = Exception.class)
	@Override
	public int info(Member updateMember, String[] memberAddress) {
		
		// 1) memberAddress 가공 처리
		// 주소를 입력하지 않은 경우
		if(updateMember.getMemberAddress().equals(",,")) {
			
			updateMember.setMemberAddress(null);
		} else { // 입력한 경우
			
			// memberAddress 배열 요소의 값을 하나의 문자열 변환
			// (단, 요소 사이 구분자는 "^^^")
			String addr = String.join("^^^", memberAddress);
			updateMember.setMemberAddress(addr);	
		}
		
		
		
		// 2) dao 호출 후 결과를 반환 받아 바로 Controller로 반환
		return dao.info(updateMember);
	}
	
	
	@Override
	public int changePw(String currentPw, String newPw, int memberNo) {
		// TODO Auto-generated method stub
		return 0;
	}
}

