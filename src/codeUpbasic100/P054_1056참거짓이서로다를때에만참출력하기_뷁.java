package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P054_1056참거짓이서로다를때에만참출력하기_뷁 {

	public static void main(String[] args) {

		//xor 에 대한 문제 
		/*
		      0001 true
		 xor 0000 false
		 --------------
				0001
			
			  0001 true
		 xor 0001 true
		 --------------
		 	   0000
		 	   
		 */
		Scanner sc=new Scanner(System.in); 
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		
		if((a^b)==0){
			System.out.println(0);
		}else{
			System.out.println(1);
		}

			
	
	}
}
