package test.main;

import test.mypac.Wallet;

public class MainClass09 {
	public static void main(String[] args) {
		//지갑에 돈을 넣고
		Wallet.addMoney(10000);
		
		Runnable run1=new Runnable() {
			@Override
			public void run() {
				//인출한 돈을 저장할 지역변수
				int totalMoney=0;
				//지갑에서 돈 인출
				while(true) {
					//김구라 이름으로 돈 인출
					int money=Wallet.getMoney("김구라");
					//0이 리턴되면 반복문 탈출
					if(money==0) break;
					//인출한 돈을 지역변수에 누적시키기
					totalMoney += money;
				}
				System.out.println("김구라가 인출한 돈: "+totalMoney);
			}
		};
		Runnable run2=new Runnable() {
			@Override
			public void run() {
				//인출한 돈을 저장할 지역변수
				int totalMoney=0;
				//지갑에서 돈 인출
				while(true) {
					//김구라 이름으로 돈 인출
					int money=Wallet.getMoney("해골");
					//0이 리턴되면 반복문 탈출
					if(money==0) break;
					//인출한 돈을 지역변수에 누적시키기
					totalMoney += money;
				}
				System.out.println("해골이 인출한 돈: "+totalMoney);
			}
		};
		//스레드 2개 시작하기
		new Thread(run1).start();
		new Thread(run2).start();
	}
}
