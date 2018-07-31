package test.main;
/*
[Thread]
작업단위
main() 메소드에서 시작되는 작업단위: 메인 스레드
실행의 흐름이라고도 합니다.
필요하다면 여러 개의 작업단위를 만들 수 있습니다.
*/
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 스레드가 시작됩니다.");
		//메인 스레드를 5초 동안 지연시키기
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		test();
		System.out.println("main 스레드가 종료됩니다.");
	}
	public static void test() {
		System.out.println("test() 메소드에 실행순서가 왔습니다.");
	}
}
