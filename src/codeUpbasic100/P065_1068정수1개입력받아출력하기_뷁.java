package codeUpbasic100;

import java.text.BreakIterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P065_1068정수1개입력받아출력하기_뷁 {
	public static void main(String[] args) {

		
		int a=73; 
		int score = a /10; 
		
		switch(score){
		
		case 10: 
		case 9 : System.out.println("A"); 
			break; 
		case 8 :
		case 7 :System.out.println("B");
			break;
		case 4 :
		case 5 :
		case 6 :System.out.println("C");
			break; 
		case 3:
		case 2:
		case 1:
		case 0:System.out.println("D");
			break;
		}

	}
}
