package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass03 {
	public static void main(String[] args) {
		File file1=new File("C:/myFolder/gura.txt");
		
		try {
			//File 객체를 생성자의 인자로 전달해서
			//FileWriter 객체 생성하기
			FileWriter fw=new FileWriter(file1);
			fw.write("안녕!\r\n");
			fw.write("나야 나~\r\n");
			fw.write("놀자 놀자~");
			fw.flush();
			fw.close(); //모두 기록했으면 닫아줘야 한다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일에 문자열을 기록했습니다.");
	}
}
