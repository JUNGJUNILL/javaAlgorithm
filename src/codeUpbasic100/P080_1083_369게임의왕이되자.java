package codeUpbasic100;

import java.util.*;

public class P080_1083_369게임의왕이되자 {
	
	static void recursive(int x){
		if(x ==0)return; 
		recursive(x-1);
		if(x % 3==0){
			System.out.print("X ");
		}else{
			System.out.print(x+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		int num=sc.nextInt(); 
		recursive(num); 
	}
}
