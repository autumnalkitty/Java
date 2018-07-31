package test.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		//필요한 지역변수 미리 만들기
		FileReader fr=null;
		BufferedReader br=null;
		try {
			//file 에서 문자열을 읽어들일 FileReader 객체 생성
			fr=new FileReader("C:/myFolder/gura.txt");
			br=new BufferedReader(fr);
			while(true) {
				//BufferedReader 객체를 이용해서 한 줄 읽어들이기
				String line=br.readLine();
				if(line==null) {//더 읽을 게 없으면
					break; //반복문 탈출
				}
				System.out.println(line);
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {//예외가 발생하든 안하든 반드시 실행 보장
			//마무리 작업
			try {
				//null 이 아닐 때
				if(fr!=null) {
					//.close() 메소드를 호출한다.
					fr.close();
				}
				if(br!=null)br.close();
			} catch (IOException e) {}
		}
	}
}