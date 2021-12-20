package codeUpbasic100;

import java.util.Scanner;

public class P092_1095_이상한출석번호부르기3 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		int num = sc.nextInt(); 
		int[] arr=new int[num]; 

		for(int i=0; i<num; i++){
			arr[i]=sc.nextInt(); 
		}
		
		int min=Integer.MAX_VALUE; 
		for(int i=0; i<arr.length; i++){
			min= min > arr[i] ? arr[i] : min; 
		}
		System.out.println(min);
		
		
	}
}
