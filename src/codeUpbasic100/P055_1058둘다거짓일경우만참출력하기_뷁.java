package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P055_1058둘다거짓일경우만참출력하기_뷁 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		/*
			false   	0000
			false     	0000
			------     ------ xor
			true      	0001

			false     0000
			true      0001
			------    ------ and 
			false     0000
				
			true      0001
			true      0001
			------    ------  xor
			false     0000 
		
			이걸 짜야하는데 어떻게 짜야할지 모르겠다. 
		 */
		int a = sc.nextInt(); 
		int b =sc.nextInt(); 
		
		boolean a_01=false; 
		boolean b_01=false;
		
		if(a==1){
			a_01=true; 
		}
		
		if(b==1){
			b_01=true; 
		}
		
		if(!(a_01 || b_01)){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
		
	
		
		
		
		
		
	}
}
