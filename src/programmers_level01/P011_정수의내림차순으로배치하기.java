package programmers_level01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class P011_�����ǳ����������ι�ġ�ϱ� {
	
	 static long solution(long n) {
	        long answer = 0;
	     
	        return answer;
	    }

	//https://programmers.co.kr/learn/courses/30/lessons/12933
	public static void main(String[] args) {

		long n=118372;
		int count=0; 
		ArrayList<Long> list=new ArrayList<>(); 
		while(n>0){
			long index = n % 10; 
			list.add(index); 
			n/=10; 
			count++; 
		}
		Collections.sort(list);
		String temp=""; 
		for(int i=list.size()-1; i>=0; i--){
			temp+=list.get(i);
		}
		
		Long.parseLong(temp); 
		
		System.out.println(temp);
		

		
		
	}

}
