package codeUpbasic100;

import java.util.Scanner;

public class P016_�������Է¹޾Ʊ״������ϱ�_�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		String str = sc.next(); 
		
		String[] arr = str.split("\\."); 
		
		System.out.printf("%04d.%02d.%02d",Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2]) );
		
		
	}
}
