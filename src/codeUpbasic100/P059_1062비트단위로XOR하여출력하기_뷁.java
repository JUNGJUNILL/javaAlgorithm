package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P059_1062비트단위로XOR하여출력하기_뷁 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		int num01 = sc.nextInt(); 
		int num02 =  sc.nextInt(); 
		
		System.out.println(num01 ^ num02);
		
	}
}
