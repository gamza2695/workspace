package edu.kh.jdbc.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCExample3 {
	
	public static void main(String[] args) {
		
		// 입력 받은 최소 급여보다 많이 받고(이상)
		// 입력 받은 최고 급여보단 적게 받는(이하)
		// 사원의 사번, 이름, 급여를 급여 내림차순 조회
		
		// [실행화면]
		// 최소 급여 : 1000000
		// 최대 급여 : 3000000
		
		// (사번) / (이름) / (급여)
		
		// 1. JDBC 객체 참조 변수 선언
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			// 2-1) Oracle JDBC Driver 객체를 메모리에 로드(적재)하기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2-2) DB 연결 정보를 이용해서 Connection 객체 생성
			String type = "jdbc:oracle:thin:@";	// 드라이버 종류	
			String host = "115.90.212.20";	// DB 서버 컴퓨터 IP주소
			String port = ":10000";		//DB 서버 컴퓨터 내에서 DB 프로그램 번호
			String dbName = ":ORCL"; // DB 이름

			String userName = "a230724_jyj"; // 사용자 계정
			String pw = "yujin4453"; // 비밀번호
			
			
			// DriverManager : Connection 만드는 객체
			conn = DriverManager.getConnection(type + host + port + dbName, userName, pw);	
			
			// 3. SQL 작성
			// \r\n == 엔터(신경x)
			Scanner sc = new Scanner(System.in);
			System.out.print("최소 급여 : ");
			int min = sc.nextInt();
			System.out.print("최대 급여 : ");
			int max = sc.nextInt();			
			
			String sql = "SELECT EMP_ID, EMP_NAME, SALARY\r\n"
					+ "FROM EMPLOYEE\r\n"
					+ "WHERE SALARY BETWEEN "+ min +" AND "+ max +"\r\n"
					+ "ORDER BY SALARY DESC";
			
			// 4. Statement 객체 생성
			stmt = conn.createStatement();
			
			// 5. Statement 객체 이용해서 SQL 수행 후 결과 반환 받기
			// (SELECT 수행하면 ResultSet 반환..!!)
			rs = stmt.executeQuery(sql);
			

			while(rs.next()) {
				// rs.next() : 한 행씩 이동해서 있으면 true, 없으면 false
				
				String empId = rs.getString("EMP_ID");
				String empName = rs.getString("EMP_NAME");
				int salary = rs.getInt("SALARY");
				
				System.out.printf("%s / %s / %d \n", empId, empName, salary);	
			} // while 종료
			
		} catch (Exception e) {
			// Exception: 모든 예외의 최상위 부모
			// -> 다형성(업캐스팅)을 이요해서 모든 자식 예외를 잡아서 처리
			e.printStackTrace();
		} finally {
			// 7. JDBC 객체 자원 반환 (역순으로!)
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		
	}
	

}
