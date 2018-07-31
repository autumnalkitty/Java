package test.main;

import test.mypac.SubWorker;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 스레드가 시작됩니다.");
		
		//새로운 작업단위 시작하기
		new SubWorker().start();
		new SubWorker().start();
		new SubWorker().start();
		
		System.out.println("main 스레드가 종료됩니다");
	}
}
