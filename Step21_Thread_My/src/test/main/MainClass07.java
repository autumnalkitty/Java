package test.main;

public class MainClass07 {
	public static void main(String[] args) {
		//익명의 inner class 를 이용해서
		//Runnable type 참조값 얻어내기
		Runnable run1=new Runnable() {
			@Override
			public void run() {
				System.out.println("새로운 작업단위!");
			}
		};
		new Thread().start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				
			}
		}).start();
	}
}
