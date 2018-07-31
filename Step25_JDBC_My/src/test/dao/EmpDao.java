package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.EmpDto;
import test.util.DBConnect;

public class EmpDao {
	//single ton 으로 사용할 수 있도록 구조를 잡으세요.
	private static EmpDao dao;
	private EmpDao() {}
	public static EmpDao getInstance() {
		if(dao==null ) {
			dao=new EmpDao();
		}
		return dao;
	}
	//사원 목록을 리턴해주는 메소드
	public List<EmpDto> getList() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<EmpDto> list=new ArrayList<>();
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			StringBuilder builder=new StringBuilder();
			builder.append("SELECT empno, ename, sal, dname, ");
			builder.append("TO_CHAR(hiredate, 'YYYY\"년 \"MM\"월 \"DD\"일\"') AS hiredate FROM ");
			builder.append("emp INNER JOIN dept USING(deptno) ORDER BY empno ASC");
			//실행할 sql 문
			/*String sql="SELECT empno, ename, sal, dname, "
					+ "TO_CHAR(hiredate, 'YYYY\"년 \"MM\"월 \"DD\"일\"') AS hiredate FROM "
					+ "emp INNER JOIN dept USING(deptno) ORDER BY empno ASC";*/
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(builder.toString());
			//sql 문을 수행하고 그 결과를 ResultSet 객체에 담는다.
			rs=pstmt.executeQuery();
			//반복문 돌면서 사원정보를 읽어오기
			while(rs.next()) {
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				double sal=rs.getDouble("sal");
				String dname=rs.getString("dname");
				String hiredate=rs.getString("hiredate");
				//EmpDto 객체에 담기
				EmpDto dto=new EmpDto();
				dto.setEmpno(empno);
				dto.setEname(ename);
				dto.setSal(sal);
				dto.setDname(dname);
				dto.setHiredate(hiredate);
				//ArrayList(가변배열) 에 누적
				list.add(dto);
			}
		} catch(SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(Exception e) {}
		}
		return list;
	}
}
