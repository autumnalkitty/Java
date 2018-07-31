package example03;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverMain {
	public static void main(String[] args) {
		//필요한 객체를 담을 변수 만들기
		ServerSocket serverSocket=null;
		try {
			//5000번 port 에서 클라이언트의 접속을 기다릴 수 있는 
			//ServerSocket 객체를 생성해서 참조값을 변수에 담기
			serverSocket=new ServerSocket(5000);
			//무한 루프 돌면서
			while(true) {
				//클라이언트의 접속을 기다린다.
				Socket socket=serverSocket.accept();
				System.out.println("클라이언트가 접속함!");
				//생성자의 인자로 Socket 객체의 참조값을
				//전달해서 스레드 객체를 생성
				Thread t=new ServerThread(socket);
				//스레드를 시작한다.
				t.start();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket!=null) serverSocket.close();
			} catch(Exception e) {}
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}
