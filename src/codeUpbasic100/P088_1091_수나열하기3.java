package codeUpbasic100;

import java.util.Scanner;

public class P088_1091_수나열하기3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 

		
		long start=sc.nextInt();  
		int dd =sc.nextInt(); 
		int d    =sc.nextInt(); 
		int num =sc.nextInt(); 
		/*
		 1*(-2) = -2 +1 =-1
		 
		 */
		for(int i=1; i<num; i++){
			start=(start*dd)+d; 
		}
		System.out.println(start);
	}
}
