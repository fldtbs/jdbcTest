package jdbcTest;

import java.sql.*;

public class JDBC_EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/student_db";
		String username = "root";
		String password = "paul6422";
		String query = "select * from smembers";
		
		ResultSet ret = null;
		Connection conn = null;//DB 연결 객체 선언
		Statement stmt = null;//sql 실행 객체 선언
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//mysql jdbc 드라이버 호출
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("DB 연결완료!!!");
			stmt = conn.createStatement();//SQL실행용 statement 객체 생성
			ret = stmt.executeQuery(query);//SQL실행-반환되는 결과값을 ResultSet으로 받음
			
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러!!!");
		} catch(SQLException e) {
			System.out.println("DB 연결 에러!!!");
		}
	}

}
