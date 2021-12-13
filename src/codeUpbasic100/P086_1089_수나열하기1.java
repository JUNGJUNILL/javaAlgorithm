package codeUpbasic100;

import java.util.Scanner;

public class P086_1089_수나열하기1 {
	
	//피보나치 수열 
	static int fibonacci(int x){
		
		if(x <=2 )return 1; 
		return fibonacci(x-1) + fibonacci(x-2); 
		
	}
	
	//재귀함수로 만들 수 없을까?
	static int recursive(int x){
		
		return 0; 
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 

		
		int start=sc.nextInt();  
		int d    =sc.nextInt(); 
		int num =sc.nextInt(); 
		
		for(int i=0; i<num-1; i++){
			start+=d;
		}
		System.out.println(start);
		
		
	}
}
