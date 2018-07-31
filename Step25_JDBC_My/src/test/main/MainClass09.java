package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		MemberDao 객체를 이용해서
		2번 회원의 정보를 수정해보세요.
		이름: 이주환
		주소: 상도동
		*/
		MemberDao dao=MemberDao.getInstance();
		//MemberDto dto=new MemberDto(2, "이주환", "상도동");
		MemberDto dto=new MemberDto();
		dto.setNum(2);
		dto.setName("이주환");
		dto.setAddr("상도동");
		dao.update(dto);
	}
}
