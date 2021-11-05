package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P033_1035_16진정수1개입력받아8진수로출력하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int a = Integer.parseInt(sc.next(),16); 	
		String b = Integer.toOctalString(a); 
		System.out.println(b);
		
		
	}
}
