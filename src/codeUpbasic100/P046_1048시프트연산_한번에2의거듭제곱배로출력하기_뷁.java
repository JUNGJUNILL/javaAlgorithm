package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P046_1048시프트연산_한번에2의거듭제곱배로출력하기_뷁 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		int num01 = sc.nextInt(); 
		int num02 = sc.nextInt(); 
		
		System.out.println(num01<<num02);
		//num01 * 2^num02
		//1 * 2^3  = 8 
		
		
	}
}
