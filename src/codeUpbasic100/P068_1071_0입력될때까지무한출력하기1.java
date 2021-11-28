package codeUpbasic100;

import java.text.BreakIterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P068_1071_0입력될때까지무한출력하기1 {
	
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 	

		while(true){
			int n =sc.nextInt(); 
			
			if(n==0) break; 
			System.out.println(n);
		}
		

	}
}
