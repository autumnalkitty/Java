package test.mypac;
/*
[Thread 만들기]
방법 2
1. Runnable 인터페이스를 구현한 클래스를 정의한다.
2. run() 메소드를 재정의(override)한다.
3. 만든 클래스를 이용해서 객체를 생성한다.
4. Thread 클래스로 객체를 생성하면서 생성자의 인자로 참조값을 전달한다.
5. 생성한 Thread 객체의 start() 메소드를 호출해서 새로운 스레드를 시작한다.
*/
public class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("새로운 스레드가 시작됩니다.");
		int count=0;
		while(true) {
			count++;
			System.out.println("count: "+count);
			try {
				Thread.sleep(5000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
