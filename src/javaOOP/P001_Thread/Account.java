package javaOOP.P001_Thread;

public class Account {
	
	static long balance=10000;
	

	public synchronized void deposit(long amount) {
		balance = balance + amount;
	}

	public synchronized void withdraw(long amount) {
		balance = balance - amount;
	}

	public void inquiry() {
		System.out.println("���� �ܾ��� " + balance + "�� �Դϴ�");
	}



}
