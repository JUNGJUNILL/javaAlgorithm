package codeUpbasic100;

import java.util.Scanner;

public class P017_주민번호입력받아형태바꿔출력하기 {

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
