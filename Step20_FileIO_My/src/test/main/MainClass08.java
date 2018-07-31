package test.main;

import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		//키보드로부터 문자열을 입력받을 객체
		Scanner scan=new Scanner(System.in);
		//입력한 모든 문자열의 내용을 가지고 있는 String 객체
		String msg="";
		while(true) {
			System.out.print("한 줄 입력(종료:q): ");
			//문자열을 한 줄 입력받아서
			String str=scan.nextLine();
			if(str.equals("q")) {//q 를 입력하면 반복문 탈출
				break;
			}
			//연결연산자로 이어붙인다.
			msg=msg+str;
		}
		//입력된 내용 출력하기
		System.out.println("msg: "+msg);
	}
}
