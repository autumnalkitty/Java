package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		//member 테이블에 delete 수행하기
		//삭제할 회원정보
		int num=4;
		//필요한 객체를 담을 변수 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			String sql="DELETE FROM member WHERE num=?";
			//sql 문을 수행할 PreparedStatement 객체 얻어내기
			pstmt=conn.prepareStatement(sql);
			//? 에 값 바인딩하기
			pstmt.setInt(1, num);
			int flag=pstmt.executeUpdate(); //자동으로 commit
			if(flag>0) {
				System.out.println(flag+"개의 row 삭제!");
			} else {
				System.out.println("삭제된 row 없음.");
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

