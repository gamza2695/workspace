package edu.kh.project.myPage.model.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;

@Mapper
public interface MyPageMapper {

	/** 회원 정보 수정
	 * @param updateMember
	 * @return result
	 */
	int info(Member updateMember);

	/** 비밀번호 조회
	 * @param loginMemberNo
	 * @return 로그인한 회원의 암호화된 비밀번호 encPw
	 */
	String selectMemberPw(int memberNo);

	/** 비밀번호 변경
	 * @param map
	 * @return result
	 */
	int changePw(Map<String, Object> map);

	
	/** 회원 탈퇴
	 * @param memberNo
	 * @return result
	 */
	int secession(int memberNo);

	/** 프로필 이미지 수정
	 * @param loginMember
	 * @return result
	 */
	int profile(Member loginMember);


}
