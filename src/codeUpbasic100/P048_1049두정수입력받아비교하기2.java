package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P048_1049두정수입력받아비교하기2 {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in); 
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		
		if(a > b){
			System.out.println(1);
		}else if(a<=b){
			System.out.println(0);
		}
		
		
	}
}
