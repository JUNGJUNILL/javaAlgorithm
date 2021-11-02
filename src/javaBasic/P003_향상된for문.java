package javaBasic;

import java.util.LinkedList;
import java.util.Queue;

public class P003_향상된for문 {

	public static void main(String[] args) {
		
		Main m = new Main(); 
		System.out.println(m.hello(10));
		
		System.out.println("======================");
		Queue<Integer> q = new LinkedList<>(); 
		q.add(1);
		q.add(2);
		q.add(3);
		
		System.out.println(q.peek());
	
		System.out.println("-------------------");
		for(int i=0; i<5; i++){
			if(i==0){
				continue; 
			}
			
			System.out.println(i);
		}
		
		
	}

}


class Main{
	class Hello{
		int number; 
		
		public Hello(int value){
			this.number = value; 
		}
	}
	
	public int hello(int value){
		
		Hello h =new Hello(value); 
		return h.number; 
	}
	
	
}
