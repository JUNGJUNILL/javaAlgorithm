package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P048_1050두정수입력받아비교하기2 {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in); 
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		//b가 a보다 크거나 같다. 
		//다르게 말하면 a는 b보다 작거나 같다. 
		if(a<=b){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
		
	}
}
