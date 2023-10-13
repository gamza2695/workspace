package edu.kh.project.myPage.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.project.member.model.dto.Member;

// DAO(Database Access Object) : DB 접근 객체(SQL 수행 후 결과 반환)
// Repository : 저장소(DB, 파일, ftp server)

@Repository	// 저장소 연결 역할 + bean 등록
public class MyPageDAOImpl implements MyPageDAO{
	
	// Mybatis
	// JDBC(Java와 DB 연결을 위한 Java API) 프레임워크
	
	// Mybatis를 이용한 DB 연결 + DBCP + 트랜잭션 자동 제어 bean DI
	@Autowired
	private SqlSessionTemplate sqlSession; // root-context.xml 참고
	
	
	
	@Override
	public int info(Member updateMember) {
		
		// 마이바티스 객체를 이용해서 update 수행
		// sqlSession.update("namespace값.id값", 파라미터);
		return sqlSession.update("myPageMapper.info", updateMember);
	}
}
