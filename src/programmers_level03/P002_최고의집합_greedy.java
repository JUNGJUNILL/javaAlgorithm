package programmers_level03;

import java.util.*;

public class P002_최고의집합_greedy {
	
	
	
	//합이 s인 n개의 숫자 곱이 크려면 
	//n개의 숫자가 s / n 과 가까운 숫자여야 한다.
	
	//s를 n으로 나눈 나머지를 rset , 몫을 value 라고 할 때, 
	//곱했을 때 최대가 되려면 rset개 만큼 value+1인 숫자가 존재하고,
	//나머지 개수를 value가 차지하면 된다. 
	
    public static int[] solution(int n, int s) {
    	if(n>s){
    		return new int[]{-1}; 
    	}
    	
        int[] answer=new int[n]; 
        int value=s / n; 
        int reset=s % n; 
        
        for(int i=0; i<n-reset; i++){
        	answer[i]=value; 
        }
        
        for(int i=n-reset; i<n; i++){
        	answer[i]=value+1;
        }
      
        	 return answer; 	
        }

	
	//https://programmers.co.kr/learn/courses/30/lessons/12938
	public static void main(String[] args) {

	 
		for(int i : solution(3,11)){
			System.out.println(i);
		}
	        
	}
}
