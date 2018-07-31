package test.main;
/*
[기본 자료형]
1. 논리형(boolean)
가질 수 있는 값의 범위: true, false
만드는 방법: true, false 를 직접 써주거나 비교연산 
					혹은 논리연산의 결과로 얻어낼 수 있다.
*/
public class MainClass01 {
	public static void main(String[] args) {
		//논리형 변수 선언과 동시에 값 대입하기
		boolean isRun=true;
		if(isRun) {
			System.out.println("달려요.");
		}
		//비교연산의 결과로 얻어진 데이터를 변수에 담기
		boolean isGreater=10>1;
		if(isGreater) {
			System.out.println("커요!");
		}
		//논리연산의 결과로 얻어진 데이터를 변수에 담기
		boolean result=true||false;
		
		System.out.println("main 메소드가 종료되었습니다.");
	}
}
