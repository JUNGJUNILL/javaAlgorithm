package codeUpbasic100;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P062_1065정수3개입력받아짝수만출력하기 {
	public static void main(String[] args) {

		
		Scanner sc =new Scanner(System.in); 
		
		int a = sc.nextInt(); 
		int b= sc.nextInt(); 
		int c= sc.nextInt(); 
		
		System.out.print(a %2==0 ? a+" " : " ");
		System.out.print(b %2==0 ? b+" " : " ");
		System.out.print(c %2==0 ? c+" " : " ");
		
		
		
	}
}
