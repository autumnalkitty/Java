package test.main;

public class MainClass10 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("i: "+i);
		}
		int[] nums= {10, 20, 30, 40, 50};
		for(int i=0; i<nums.length; i++) {
			int tmp=nums[i];
			System.out.println("tmp: "+tmp);
		}
	}
}
