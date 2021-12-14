package codeUpbasic100;

import java.util.Scanner;

public class P089_1092_함께문제푸는날 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		int a=sc.nextInt(); 
		int b=sc.nextInt(); 
		int c=sc.nextInt(); 
		int day=1; 
		
		while(day % a!=0 || day % b!=0 || day % c!=0){
			System.out.println(day % a+":"+day % b+":"+day % c);
			day++;
		}
		System.out.println(day);
		
		
	}
}
