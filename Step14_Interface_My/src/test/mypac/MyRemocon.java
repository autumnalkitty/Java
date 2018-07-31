package test.mypac;
/*
Remocon 인터페이스를 implements 한 클래스 정의하기
인터페스에 정의된 모든 추상 메소드를 재정의(override)해야 한다.
*/
public class MyRemocon implements Remocon {
	@Override
	public void up() {
		System.out.println("볼륨을 올려요.");
	}

	@Override
	public void down() {
		System.out.println("볼륨을 내려요.");
	}
}
