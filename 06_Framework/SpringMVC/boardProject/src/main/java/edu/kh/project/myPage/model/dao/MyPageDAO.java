package edu.kh.project.myPage.model.dao;

import edu.kh.project.member.model.dto.Member;

//인터페이스 사용 이유 : 규칙성 부여, 결합도 약화(=> 유지보수 편함)

public interface MyPageDAO {

	/** 회원 정보 수정
	 * @param updateMember
	 * @return result
	 */
	int info(Member updateMember);
	
	

}
