package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import org.omg.CORBA.INTERNAL;

public class P043_1045정수2개입력받아자동계산하기_뷁 {

	public static void main(String[] args) {
		
		
		//https://coding-factory.tistory.com/250
		int num01 = 10; 
		int num02 =3; 
		
		System.out.println(num01+num02);
		System.out.println(num01-num02);
		System.out.println(num01*num02);
		System.out.println(num01 / num02);
		System.out.println(num01 % num02);
		float f =(float)num01 / num02; 
		System.out.println(Math.round((f*100))/100.0);
		

	}
}
