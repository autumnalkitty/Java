package test.mypac;

import test.mypac.Weapon;

public class MyWeapon extends Weapon {
	//추상 클래스에서 정의된 추상 메소드는 반드시 재정의(override) 해야 한다.
	@Override
	public void attack() {
		System.out.println("내 마음대로 공격해요~");
	}
}
