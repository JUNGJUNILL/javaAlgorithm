package codeUpbasic100;

import java.util.*;

public class P074_1077_정수1개입력받아그수까지출력하기 {

	
	static void recursive(int x){
		
		if(x < 0) return; 
		recursive(x-1);
		System.out.println(x);
		
	}
	
	public static void main(String[] args) {
		
		recursive(4);
		
	}
}
