package javaBasic;

import java.util.LinkedList;
import java.util.Queue;

public class P003_향상된for문 {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>(); 
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		

		for(int i :q){
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
		
		String[] str = {"일","이","삼","사","오"}; 
		
		for(String s : str){
			System.out.println(s);
		}
		
		
		
	}

}
