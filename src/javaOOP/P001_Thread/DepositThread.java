package javaOOP.P001_Thread;

public class DepositThread implements Runnable{

	Account account; 
	
	DepositThread(Account account){
		this.account=account; 
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			account.deposit(1000);
		}
		account.inquiry();
	}
	
	

}
