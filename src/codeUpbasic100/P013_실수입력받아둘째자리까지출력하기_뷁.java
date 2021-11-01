package codeUpbasic100;

import java.util.Scanner;

public class P013_실수입력받아둘째자리까지출력하기_뷁 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		float f = sc.nextFloat(); 
		
		System.out.printf("%.2f",f); 
		
	}
}
