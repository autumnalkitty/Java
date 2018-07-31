package test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
객체를 생성한 후 메소드를 호출하면 
Connection 객체를 리턴하는 클래스 설계하기
*/
public class DBConnect {
	//필드
	private Connection conn;
	//생성자
	public DBConnect() {
		try {
			//오라클 드라이버 로드(ojdbc6.jar 필요)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//@접속 ip 주소:port 번호:DB 이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//.getConnenction(url, 계정, 비밀번호)
			conn=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공!");
		} catch(ClassNotFoundException cne) {
			cne.printStackTrace();
		} catch(SQLException se) {
			se.printStackTrace();
		}
	}
	//Connection 객체를 리턴해주는 메소드
	public Connection getConn() {
		return conn;
	}
}
