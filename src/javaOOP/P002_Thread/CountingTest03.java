package javaOOP.P002_Thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CountingTest03 {
	
	 public static void main(String[] args) {
		 Count02 count = new Count02();
	        for (int i = 0; i < 100; i++) {
	        	
	            new Thread(){
	                public void run(){
	                    for (int j = 0; j < 100; j++) {
	                    
	                        System.out.println( count.view());
	                     
	                  
	                    }
	                }
	            }.start();
	            
	        }
	        
	        
	        
	    }
	 
	 
	
	 

}

//Atomic ���
//Atomic�� CAS ��Ŀ� ����Ͽ� ����ȭ ������ �ذ��մϴ�.
//https://readystory.tistory.com/53
class Count03 {
	
	private AtomicInteger integer=new AtomicInteger(); 
	public synchronized int view() {
		 integer.incrementAndGet(); 
    	 return integer.get();
	 }

}

