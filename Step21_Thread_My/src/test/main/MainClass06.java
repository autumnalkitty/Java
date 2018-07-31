package test.main;

import test.mypac.MyRunnable;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 스레드가 시작됩니다.");
	
		new Thread(new MyRunnable()).start();
		
		System.out.println("main 스레드가 종료됩니다.");
	}
}
