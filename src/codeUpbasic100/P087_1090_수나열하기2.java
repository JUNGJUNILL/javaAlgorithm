package codeUpbasic100;

import java.util.Scanner;

public class P087_1090_수나열하기2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 

		
		long start=sc.nextInt();  
		int d    =sc.nextInt(); 
		int num =sc.nextInt(); 
		
		for(int i=1; i<num; i++){
			start*=d;
		}
		System.out.println(start);
		
	}
}
