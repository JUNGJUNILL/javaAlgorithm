package codeUpbasic100;

import java.util.Scanner;

public class P020_1023실수1개입력받아부분별로출력하기 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in); 
		
		float  f = sc.nextFloat(); 
		String[] str = String.valueOf(f).split("\\."); 
		
		for(String s : str){
			System.out.println(s);
		}
	
		
		
		
	}
}
