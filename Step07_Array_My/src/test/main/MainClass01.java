package test.main;
/*
[배열(Array)]
*/
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		/*
		String name1="김구라";
		String name2="해골";
		String name3="원숭이";
		String name4="주뎅이";
		String name5="덩어리";
		*/
		//String[] type
		String[] names= {"김구라", "해골", "원숭이", "주뎅이", "덩어리"};
		//0번방 참조
		String a=names[0];
		//1번방 참조
		String b=names[1];
		/*
		위의 코드를 javascript 로 환산하면
		var names=["김구라", "해골", "원숭이", "주뎅이", "덩어리"];
		var a=names[0];
		var b=names[1];
		*/
	}
}
