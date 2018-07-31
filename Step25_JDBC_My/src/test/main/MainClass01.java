package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
[JDBC(Java Database Connectivity)]
java 에서의 DataBase 연동 프로그래밍 연습
Oracle Database 를 연동하려면 ojdbc6.jar 파일이 사용가능한
위치에 있어야 한다. DB 를 연동하기 위한 드라이버 클래스가
ojdbc6.jar 파일에 들어있다.
*/
public class MainClass01 {
	public static void main(String[] args) {
		Connection conn=null;
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
		//필요한 객체를 담을 변수 만들기
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="SELECT num, name, addr FROM member";
			//sql 문을 수행할 PreparedStatement 객체 얻어내기
			pstmt=conn.prepareStatement(sql);
			//query 문을 수행하고 결과를 ResultSet 으로 얻는다.
			rs=pstmt.executeQuery();
			//반복문 돌면서 ResultSet 에 담긴 정보 추출하기
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				System.out.println(num+"|"+name+"|"+addr);
			}
		} catch(SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch(Exception e) {}
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}
