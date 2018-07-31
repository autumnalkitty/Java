package test.main;

import test.mypac.AttackUnit;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		AttackUnit 클래스를 이용해서 객체를 생성하고
		참조값(id) 에 . 찍어서 attack() 메소드 호출하기
		*/
		AttackUnit unit=new AttackUnit();
		unit.attack();
		unit.attack();
		unit.attack();
		/*
		 AttackUnit 클래스로 새로운 객체를 생성해서
		 attack() 메소드를 3번 호출해보세요.
		*/
		AttackUnit unit2=new AttackUnit();
		unit2.attack();
		unit2.attack();
		unit2.attack();
	}
}
