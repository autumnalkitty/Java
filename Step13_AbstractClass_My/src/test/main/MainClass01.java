package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

/*
[추상 클래스(Abstract Class)]
 class 예약어 앞에 abstract 를 명시해서 클래스를 정의한다.
 형태만 정의되고 실제 구현은 되지 않는 메소드가 존재할 수 있다.
 형태만 정의된 메소드를 만들 때는 abstract 예약어를 붙여서 메소드를 정의한다.
 생성자는 존재하지만 단독으로 객체 생성은 불가능하다.
 추상 클래스 Type 의 id 가 필요하다면 추상 클래스를 상속받은
	자식 클래스를 정의해서 객체를 생성한다.
 추상 클래스를 상속받은 자식 클래스는 부모의 추상 메소드를 모두 
	재정의(override) 해야한다.
*/

public class MainClass01 {
	public static void main(String[] args) {
		//추상 클래스로는 단독으로 객체를 생성할 수 없다.
		//Weapon w=new Weapon();
		//추상 클래스를 상속받은 자식 클래스로 객체 생성
		MyWeapon w1=new MyWeapon();
		//메소드 사용해보기
		w1.prepare();
		w1.attack();
		
		//추상 클래스 type 으로 받을 수도 있다.
		Weapon w2=new MyWeapon();
		w2.prepare();
		w2.attack();
	}
}
