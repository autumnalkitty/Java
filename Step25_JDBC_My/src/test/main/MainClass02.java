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
public class MainClass02 {
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
		//member 테이블에 insert 수행하기
		int num=4;
		String name="주뎅이";
		String addr="봉천동";
		//필요한 객체를 담을 변수 만들기
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="INSERT INTO member (num, name, addr) VALUES(?, ?, ?)";
			//sql 문을 수행할 PreparedStatement 객체 얻어내기
			pstmt=conn.prepareStatement(sql);
			//? 에 값 바인딩하기
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			//sql 문 수행하기
			pstmt.executeUpdate(); //자동으로 commit
			System.out.println("회원 정보를 저장했습니다.");
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

