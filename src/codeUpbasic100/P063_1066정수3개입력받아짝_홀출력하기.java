package codeUpbasic100;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P063_1066정수3개입력받아짝_홀출력하기 {
	public static void main(String[] args) {

		
		Scanner sc =new Scanner(System.in); 
		
		int a = sc.nextInt(); 
		int b= sc.nextInt(); 
		int c= sc.nextInt(); 
	
		System.out.println(a%2==0?"even":"odd");
		System.out.println(b%2==0?"even":"odd");
		System.out.println(c%2==0?"even":"odd");
		
	}
}
