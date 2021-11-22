package Algorithm_basic_Top10;

import java.util.LinkedList;
import java.util.Queue;

import org.omg.CORBA.INTERNAL;

public class 다익스트라 {

	//https://www.acmicpc.net/problem/1753
	public static void main(String[] args) {

		int num=12345; 
		int count=0; 
		Queue<Integer> q =new LinkedList<Integer>(); 
		
		
		while(num>0){
			int index = num % 10; 
			q.add(index); 
			num /=10; 
			count++; 
		}
		
		System.out.println(count);
		while(!q.isEmpty()){
			System.out.print(q.poll());
		}
		
		
		
	}

}
