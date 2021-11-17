package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P053_1055하나라도참이면참출력하기 {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in); 
		
		int num1=sc.nextInt(); 
		int num2=sc.nextInt(); 
		
		if(num1==1 || num2==1){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
		
		
		
	}
}
