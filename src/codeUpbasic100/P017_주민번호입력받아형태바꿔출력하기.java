package codeUpbasic100;

import java.util.Scanner;

public class P017_�ֹι�ȣ�Է¹޾����¹ٲ�����ϱ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		String str = sc.next(); 

		String[] arr = str.split("\\-"); 

		for(String s : arr){
			System.out.print(s);
		}
		
		String newStr = str.replaceAll("-", ""); 
		System.out.println(newStr);
		
		
		
	}
}
