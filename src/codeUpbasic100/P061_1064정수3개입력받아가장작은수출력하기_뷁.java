package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P061_1064����3���Է¹޾ư�������������ϱ�_�� {
	public static void main(String[] args) {
		
		int a=-1937; 
		int b=-1939;  
		int c=-2000; 
		int minCount=0; 
		
		minCount=	Math.min(minCount,a); 
		minCount=	Math.min(minCount,b); 
		minCount=	Math.min(minCount,c);
		System.out.println(minCount);
		
		//3�� �����ڸ� �̿��ؾ��Ѵ�. 
		System.out.println(
				
				a < b ? 
					a<c ? a : b<c ? b:c
					: 					
					a<c ? b<c? b : c		
								: b < c ? b : c

				);
		
		
		
	}
}
