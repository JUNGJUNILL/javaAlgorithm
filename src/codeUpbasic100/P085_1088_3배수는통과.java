package codeUpbasic100;

import java.util.Scanner;

public class P085_1088_3배수는통과 {
	
	static void recursive(int x){
		
		if(x==0) return; 
		recursive(x-1);
		
		if(x % 3!=0){
			System.out.print(x+" ");
		}
		
	}

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		int num=sc.nextInt(); 
		recursive(num); 
		
	}
}
