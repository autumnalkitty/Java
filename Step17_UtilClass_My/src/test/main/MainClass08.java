package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass08 {
   public static void main(String[] args) {
      List<MemberDto> members = new ArrayList<>();
      
      MemberDto dto1=new MemberDto(1, "김구라", "노량진");
      MemberDto dto2=new MemberDto(2, "해골", "행신동");
      MemberDto dto3=new MemberDto(3, "원숭이", "동물원");
      
      members.add(dto1);
      members.add(dto2);
      members.add(dto3);
      
      /*
      members에 들어 있는 회원 정보를 for문을 이용해서
      순서대로 콘솔창에 출력해보세요.
      [출력 형식]
      번호:1 이름:김구라 주소:노량진
      번호:2 이름:해골 주소:행신동
      번호:3 이름:원숭이 주소:동물원
       */
      for(int i=0;i<members.size();i++) {
         MemberDto member = members.get(i);
         System.out.println("번호: " + member.getNum() + " 이름: " + member.getName() + " 주소: " + member.getAddr());
      }
      System.out.println("--- 확장 for문 ---");
      for(MemberDto member:members) {
         System.out.println("번호: " + member.getNum() + " 이름: " + member.getName() + " 주소 :" + member.getAddr());
      }
   }
}