package codeUpbasic100;

import java.util.*;

public class P075_1078짝수합구하기 {

	static int temp=0; 
	
	static int recursive(int x){
		
		if(x==0) return 0; 
		recursive(x-1); 
		if(x % 2==0){
			System.out.println(x);
			temp=temp+x; 
		}
		
		return temp; 
		/*
			func(5) 6
				func(4) 6
					func(3)	 2
						func(2) 2
							func(1) 0
								func(0) 0
		 
		*/
		
		
		
	}

	public static void main(String[] args) {

		
		System.out.println(recursive(3));
		
	}
}
