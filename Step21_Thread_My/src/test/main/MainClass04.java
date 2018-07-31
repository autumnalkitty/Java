package test.main;

import test.mypac.Player;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 스레드가 시작됩니다.");
		
		//스레드 객체 생성해서
		Thread p1=new Player("김구라");
		//시작하기
		p1.start();
		
		//스레드 객체 생성해서
		Thread p2=new Player("해골");
		//시작하기
		p2.start();
		
		System.out.println("main 스레드가 종료됩니다.");
	}
}
