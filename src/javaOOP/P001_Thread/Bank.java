package javaOOP.P001_Thread;

public class Bank extends Thread{

	public static void main(String[] args) {
		
		Account account = new Account();
		for(int i=0; i<5; i++) {
			Thread deposit = new Thread(new DepositThread(account));
			Thread withdraw = new Thread(new WithdrawThread(account));
			deposit.start();
			withdraw.start();
		}
	}
}
