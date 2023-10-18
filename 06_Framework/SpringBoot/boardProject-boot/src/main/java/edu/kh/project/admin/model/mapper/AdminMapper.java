package edu.kh.project.admin.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;

@Mapper
public interface AdminMapper {

	/** 회원 조회
	 * @param inputEmail
	 * @return result
	 */
	Member selectMember(String inputEmail);

}
