package codeUpbasic100;

import java.util.*;

public class P074_1077_����1���Է¹޾Ʊ׼���������ϱ� {

	
	static void recursive(int x){
		
		if(x < 0) return; 
		recursive(x-1);
		System.out.println(x);
		
	}
	
	public static void main(String[] args) {
		
		recursive(4);
		
	}
}
