package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P050_1052두정수입력받아비교하기4 {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in); 
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 

		if(a!=b){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
		
	}
}
