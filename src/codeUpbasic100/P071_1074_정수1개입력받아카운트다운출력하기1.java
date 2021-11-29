package codeUpbasic100;

import java.util.*;

public class P071_1074_정수1개입력받아카운트다운출력하기1 {

	static void recursive(int x){
		if(x==0) return; 
		System.out.println(x);
		recursive(x-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		int a =sc.nextInt(); 
		
		for(int i=5; i>0; i--){
			System.out.println(i);
		}
		System.out.println("------------------");
		recursive(a); 
	}
}
