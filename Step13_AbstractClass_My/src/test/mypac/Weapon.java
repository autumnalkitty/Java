package test.mypac;

//추상 클래스
public abstract class Weapon {
	//일반 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	//추상 메소드
	public abstract void attack();
}
