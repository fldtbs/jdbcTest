package jdbcTest;

import java.sql.*;

public class JDBC_EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");//mysql jdbc 드라이버 호출
			Connection conn = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","paul6422");
			System.out.println("DB 연결완료!!!");
			
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러!!!");
		} catch(SQLException e) {
			System.out.println("DB 연결 에러!!!");
		}
	}

}
