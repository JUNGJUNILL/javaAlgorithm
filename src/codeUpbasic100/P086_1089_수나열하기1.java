package codeUpbasic100;

import java.util.Scanner;

public class P086_1089_�������ϱ�1 {
	
	//�Ǻ���ġ ���� 
	static int fibonacci(int x){
		
		if(x <=2 )return 1; 
		return fibonacci(x-1) + fibonacci(x-2); 
		
	}
	
	//����Լ��� ���� �� ������?
	static int recursive(int x){
		
		return 0; 
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 

		
		int start=sc.nextInt();  
		int d    =sc.nextInt(); 
		int num =sc.nextInt(); 
		
		for(int i=0; i<num-1; i++){
			start+=d;
		}
		System.out.println(start);
		
		
	}
}
