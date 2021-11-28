package codeUpbasic100;

import java.text.BreakIterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P067_1070_월입력받아계절출력하기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		
		String str= sc.next(); 
		
		switch(str){
			
		case "12":
		case "1":
		case "2": System.out.println("winter");
		break; 

		case "3":
		case "4":
		case "5": System.out.println("spring");
		break; 		
		
		case "6":
		case "7":
		case "8": System.out.println("summer");
		break; 
		
		
		
		case "9":
		case "10":
		case "11": System.out.println("fall");
		break; 
		
		}
		

	}
}
