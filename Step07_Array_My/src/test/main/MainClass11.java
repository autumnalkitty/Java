package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		//1. String type 을 담을 수 있는 방 5개짜리 배열 객체 생성
		String[] names=new String[5];
		//2. 배열 5개의 방에 각각 다른 문자열 저장하기
		names[0]="김구라";
		names[1]="해골";
		names[2]="원숭이";
		names[3]="주뎅이";
		names[4]="덩어리";
		//3. 반복문 for 를 이용해서 5개의 방에 있는 문자열을
		//순서대로 콘솔창에 출력하기
		for(int i=0; i<names.length; i++) {
			String tmp=names[i];
			System.out.println(tmp);
		}
	}
}
