package codeUpbasic100;

import java.text.BreakIterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P066_1069평가입력받아다르게출력하기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		
		String str= sc.next(); 
		
		switch(str){
		
		case "A" :System.out.println("best!!");
		break;
		case "B" :System.out.println("good!!");
		break; 
		case "C" :System.out.println("run!");
		break;
		case "D" :System.out.println("slowly!");
		break; 
		default : System.out.println("what?");
		break; 
		
		}

	}
}
