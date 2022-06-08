package javaOOP.P002_Thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CountingTest02 {
	
	 public static void main(String[] args) {
		 Count02 count = new Count02();
	        for (int i = 0; i < 100; i++) {
	        	
	            new Thread(){
	                public void run(){
	                    for (int j = 0; j < 100; j++) {
	                    	count.view();
	                        System.out.println(count.get());
	                     
	                  
	                    }
	                }
	            }.start();
	            
	        }
	        
	        
	        
	    }
	 
	 
	
	 

}

//¸í½ÃÀû lock
class Count02 {
    private volatile int count=0;
     public int view() {
    	 return count++;
	 }
     public int get(){
    	 return this.count; 
     }

}

