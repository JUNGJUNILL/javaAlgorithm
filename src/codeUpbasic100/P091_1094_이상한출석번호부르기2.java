package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;

public class P091_1094_이상한출석번호부르기2 {

	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		int num=sc.nextInt(); 
		Stack<Integer> stack =new Stack<>();
		
		for(int i=0; i<num; i++){
			int n=sc.nextInt(); 
			stack.push(n);
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
		
		
	}

}
