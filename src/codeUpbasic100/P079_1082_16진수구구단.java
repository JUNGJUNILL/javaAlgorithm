package codeUpbasic100;

import java.util.*;

public class P079_1082_16진수구구단 {
	

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 
		int n = sc.nextInt(16); 
		for(int i=1; i<16; i++){
			System.out.format("%x*%x=%x\n",n,i,n*i);
		}
		
	}
}
