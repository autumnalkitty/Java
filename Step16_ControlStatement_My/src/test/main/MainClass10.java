package test.main;

import java.util.Scanner;

public class MainClass10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열 입력(종료: q): ");
			String msg=scan.nextLine();
			if(msg.equals("q")) {
				break;
			}
			System.out.println("입력한 문자열: "+msg);
		}
		System.out.println("main 메소드가 종료되었습니다.");
	}
}
