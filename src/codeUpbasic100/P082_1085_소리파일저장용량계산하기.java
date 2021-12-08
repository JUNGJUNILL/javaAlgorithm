package codeUpbasic100;

import java.io.*;
import java.util.Scanner;

public class P082_1085_소리파일저장용량계산하기 {
	/*
	 
	 h : 1초 동안 마이크로 소리강약을 체크하는 수 
	 
	 b : 한 번 체크한 결과를 저장하는 비트 8bit = 1byte
	 
	 c : 좌우 등 소리를 저장할 트랙 개수인 채널 ,스테레오(2) , 5.1채널(6)
	 
	 s : 녹음할 시간 
	 
	 */
	public static void main(String[] args) throws Exception {
		
		Scanner sc =new Scanner(System.in); 
		long h=sc.nextInt();
		long b=sc.nextInt();
		long c=sc.nextInt();
		long s=sc.nextInt();
		long a =h*b*c*s; 
		double Byte= a/8; //다 곱해서 8로 나누면 바이트가 되는지 몰랐다.
						   //이 부분에서 막혔다. 
		double K_Byte= Byte/1024; 
		double M_Byte= K_Byte/1024; 
		System.out.println(Math.round(M_Byte*10)/10.0+" MB");
		
		
		
	}
}
