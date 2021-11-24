package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P055_1057참거짓이서로같을때에만참출력하기_뷁 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		
		int a = sc.nextInt(); 
		int b = sc.nextInt();

		if((a^b)!=0){
			System.out.println(0);
		}else{
			System.out.println(1);
		}
	
	}
}
