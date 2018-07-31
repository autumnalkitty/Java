package test.main;

import java.io.FileReader;
import java.io.IOException;

public class MainClass06 {
	public static void main(String[] args) {
		try {
			//file 에서 문자열을 읽어들일 FileReader 객체 생성
			FileReader fr=new FileReader("C:/myFolder/gura.txt");
			//한번에 5글자를 담을 수 있는 car[] 객체 생성
			char[] buffer=new char[5];
			while(true) {
				//char[] 을 전달해서 읽어들이기
				//읽은 문자의 개수가 리턴된다.
				//더 읽을 문자가 없으면 -1이 리턴된다.
				int readedCount=fr.read(buffer);
				if(readedCount==-1) {
					break; //반복문 탈출
				}
				//배열에 있는 모든 내용을 출력하기
				for(int i=0; i<readedCount; i++) {
					char tmp=buffer[i];
					System.out.print(tmp);
				}
			}
			//마무리 작업
			fr.close();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
