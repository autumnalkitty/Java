package test.main;

import test.mypac.MemberDto;

public class MainClass03 {
	public static void main(String[] args) {
		MemberDto mem1=new MemberDto();
		mem1.setNum(1);
		mem1.setName("김구라");
		mem1.setAddr("노량진");
		//2번 회원의 정보를 MemberDto 객체를 생성할 때 저장
		MemberDto mem2=new MemberDto(2, "해골", "행신동");
	}
}
