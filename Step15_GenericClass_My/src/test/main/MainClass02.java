package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;
import test.mypac.Orange;

public class MainClass02 {
	public static void main(String[] args) {
		//Apple 객체를 담을 수 있는 FruitBox 객체 생성
		FruitBox<Apple> aBox=new FruitBox<Apple>();
		//Apple 객체 담기
		aBox.push(new Apple());

		FruitBox<Banana> bBox=new FruitBox<Banana>();
		bBox.push(new Banana());
		
		//객체를 new 할 때 Generic type 은 생략가능
		FruitBox<Orange> oBox=new FruitBox<>();
		oBox.push(new Orange());
	}
}
