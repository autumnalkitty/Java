package test.main;

import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("c:/myFolder/monkey.txt");
			fw.write("원숭아~\r\n");
			fw.write("당구 한 게임 콜?");
			fw.flush();
			fw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("monkey.txt 에 문자열을 기록했습니다.");
	}
}
