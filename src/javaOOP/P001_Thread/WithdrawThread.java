package javaOOP.P001_Thread;

public class WithdrawThread implements Runnable{

	
	Account account;

	WithdrawThread(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			account.withdraw(1000);
		}
		account.inquiry();
	}

}
