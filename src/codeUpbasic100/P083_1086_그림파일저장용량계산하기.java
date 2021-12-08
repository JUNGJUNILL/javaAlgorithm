package codeUpbasic100;

import java.util.Scanner;

public class P083_1086_그림파일저장용량계산하기 {

	public static void main(String[] args) {
		//100 100 4
		Scanner sc =new Scanner(System.in); 
		long w=sc.nextLong(); 
		long h=sc.nextLong(); 
		long b=sc.nextLong(); 
		
		double a=w*h*b; 
		double Byte=a/8; 
		double kByte=Byte/1024;
		double mByte=kByte/1024; 
		System.out.printf("%.2f MB",Math.round(mByte*100)/100.0);
		
		
		
		
	}

}
