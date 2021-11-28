package codeUpbasic100;

import java.util.*;

public class P069_1072정수입력받아계속출력하기 {
	
	static void recursive(int x){
		
		if(x==0) return; 
		recursive(x-1);
		System.out.println(x);
	}
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		recursive(sc.nextInt());
		
	}
}
