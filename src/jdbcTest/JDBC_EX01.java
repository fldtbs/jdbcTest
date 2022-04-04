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
		Connection conn = null;//DB ���� ��ü ����
		Statement stmt = null;//sql ���� ��ü ����
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//mysql jdbc ����̹� ȣ��
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("DB ����Ϸ�!!!");
			stmt = conn.createStatement();//SQL����� statement ��ü ����
			ret = stmt.executeQuery(query);//SQL����-��ȯ�Ǵ� ������� ResultSet���� ����
			
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����!!!");
		} catch(SQLException e) {
			System.out.println("DB ���� ����!!!");
		}
	}

}
