package codeUpbasic100;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P064_1067정수1개입력받아분석하기 {
	public static void main(String[] args) {

		
		int a=Integer.MIN_VALUE; 
		
		if(a<0){
			System.out.println("minus");
			if(a%2==0){
				System.out.println("even");
			}else{
				System.out.println("odd");
			}
		}else{
			System.out.println("plus");
			if(a%2==0){
				System.out.println("even");
			}else{
				System.out.println("odd");
			}
		}

	}
}
