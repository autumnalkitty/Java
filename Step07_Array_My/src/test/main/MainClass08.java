package test.main;

import test.auto.Car;

public class MainClass08 {
	public static void main(String[] args) {
		//Car type 을 담을 수 있는 방 5개짜리 배열 객체 생성
		Car[] cars=new Car[5];
		//0번 방에 Car 객체의 참조값을 대입해보세요.
		cars[0]=new Car();
		//1번 방에 Car 객체의 참조값을 대입해보세요.
		cars[1]=new Car();
		//Car 객체를생성해서 참조값을 변수에 담기
		Car c=new Car();
		//2번 방과 3번 방에 c 라는 변수에 있는 참조값을 대입
		cars[2]=c;
		cars[3]=c;	
		cars[4]=cars[0];
	}
}
