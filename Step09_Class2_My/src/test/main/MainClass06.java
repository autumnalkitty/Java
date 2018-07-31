package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		System.in 은 키보드로부터 입력받을 수 있는 
		InpitStream type 의 참조값이 들어있는 필드이다.
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력: ");
		//Scanner 객체의 nextLine() 메소드를 이용해서
		//문자열 입력받기
		String str=scan.nextLine();
		//입력받은 문자열을 콘솔창에 출력하기
		System.out.println("입력받은 문자열: "+str);
	}
}
