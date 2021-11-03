package codeUpbasic100;

import java.util.Scanner;

public class P021_1024단어1개입력받아나누어출력하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		String str = sc.next(); 
		
		for(int i=0; i<str.length(); i++){
			System.out.print('\'');
			System.out.print(str.charAt(i));
			System.out.print('\'');
			System.out.println();
		}
		
		System.out.println("=============");
		
		int strLength = str.length(); 
		int num = 0; 
		while(strLength >0){
			
			System.out.printf("\'%c\'\n",str.charAt(num++));
			strLength--;
		}
		
		System.out.println("=============");
		
		String[] strArray = str.split(""); 
		for(String s : strArray){
			System.out.println("\'"+s+"\'");
		}
		
	}
}
