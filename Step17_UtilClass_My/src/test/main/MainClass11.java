package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.mypac.MemberDto;

public class MainClass11 {
	public static void main(String[] args) {
		/*
		Map<String, Object> 를 저장할 ArrayList 객체를 생성해서
		참조값을 members 라는 변수에 담아보세요.
		*/
		List<Map<String, Object>> members=new ArrayList<>();
		
		//회원 3명의 정보를 members 에 담아보세요.
		Map<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("addr", "노량진");
		
		Map<String, Object> map2=new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "해골");
		map2.put("addr", "행신동");
		
		Map<String, Object> map3=new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "원숭이");
		map3.put("addr", "동물원");
		
		//ArrayList 객체에 담기
		members.add(map1);
		members.add(map2);
		members.add(map3);
		/*
		//데이터 참조
		List<Map<String, Object>> a=members;
		Map<String, Object> b=members.get(0);
		int c=(int)members.get(0).get("num");
		String d=(String)members.get(0).get("name");
		String e=(String)members.get(0).get("addr");	
		*/
		/*
		for 문을 이용해서 members 에 있는 회원정보를 콘솔창에 출력해보세요.
		[출력 형식]
		번호: 1 이름: 김구라 주소: 노량진
		*/
		for(int i=0; i<members.size(); i++) {
			Map<String, Object> tmp=members.get(i);
			System.out.println("번호: "+(int)tmp.get("num")+" 이름: "+(String)tmp.get("name")+" 주소: "+(String)tmp.get("addr"));
		}
		System.out.println("-- 확장 for문 --");
		for(Map<String, Object> tmp:members) {
			System.out.println("번호: "+(int)tmp.get("num")+" 이름: "+(String)tmp.get("name")+" 주소: "+(String)tmp.get("addr"));
		}
	}
}
