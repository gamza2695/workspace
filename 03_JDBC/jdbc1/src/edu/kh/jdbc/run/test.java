package edu.kh.jdbc.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String type = "jdbc:oracle:thin:@";
			String host = "115.90.212.20";
			String port = ":10000";
			String dbName = ":ORCL";
			
			String userName = "a230724_jyj";
			String pw = "yujin4453";
			
			conn = DriverManager.getConnection(type + host + port + dbName, userName, pw);
			
			String sql = "SELECT EMP_NAME FROM EMPLOYEE";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				String empName = rs.getString("EMP_NAME");
				
				System.out.printf("%s\n",empName);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
