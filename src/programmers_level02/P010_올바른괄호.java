package programmers_level02;

import java.util.Queue;
import java.util.Stack;

public class P010_올바른괄호 {

	
	//https://programmers.co.kr/learn/courses/30/lessons/12909
	public static void main(String[] args) {
		String s = "()())"; 
		int count=0; 
		for(int i=0; i<s.length(); i++){
			
			if(s.charAt(i)=='('){
				count++; 
			}
			
			if(s.charAt(i)==')'){
				count--; 
			}
			
			//count가 음수인 경우
			if(count < 0){
				break; 
			}		
		}
		
		System.out.println(count);
		
	}
}