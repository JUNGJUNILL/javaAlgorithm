package javaOOP.P002_Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CountingTest01 {
	
	 public static void main(String[] args) {
	        Count01 count = new Count01();
	        for (int i = 0; i < 100; i++) {
	        	
	            new Thread(){
	                public void run(){
	                    for (int j = 0; j < 100; j++) {
	                    	count.getLock().lock();
	                        System.out.println( count.view());
	                        count.getLock().unlock();
	                  
	                    }
	                }
	            }.start();
	            
	        }
	        
	        
	        
	    }
	 
	 
	
	 

}

//¸í½ÃÀû lock
class Count01 {
    private Integer count=0;
 	private Lock lock = new ReentrantLock();
     public int view() {
		 synchronized (this.count) {
			 return count++;
		 }
	 }
  	public Lock getLock(){
 		return lock;
 	};
}

