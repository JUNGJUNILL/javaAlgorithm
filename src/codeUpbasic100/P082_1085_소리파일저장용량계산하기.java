package codeUpbasic100;

import java.io.*;
import java.util.Scanner;

public class P082_1085_�Ҹ���������뷮����ϱ� {
	/*
	 
	 h : 1�� ���� ����ũ�� �Ҹ������� üũ�ϴ� �� 
	 
	 b : �� �� üũ�� ����� �����ϴ� ��Ʈ 8bit = 1byte
	 
	 c : �¿� �� �Ҹ��� ������ Ʈ�� ������ ä�� ,���׷���(2) , 5.1ä��(6)
	 
	 s : ������ �ð� 
	 
	 */
	public static void main(String[] args) throws Exception {
		
		Scanner sc =new Scanner(System.in); 
		long h=sc.nextInt();
		long b=sc.nextInt();
		long c=sc.nextInt();
		long s=sc.nextInt();
		long a =h*b*c*s; 
		double Byte= a/8; //�� ���ؼ� 8�� ������ ����Ʈ�� �Ǵ��� ������.
						   //�� �κп��� ������. 
		double K_Byte= Byte/1024; 
		double M_Byte= K_Byte/1024; 
		System.out.println(Math.round(M_Byte*10)/10.0+" MB");
		
		
		
	}
}
