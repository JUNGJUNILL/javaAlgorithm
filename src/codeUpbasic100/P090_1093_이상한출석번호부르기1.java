package codeUpbasic100;

import java.util.Scanner;

public class P090_1093_이상한출석번호부르기1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		int num=sc.nextInt(); 
		int[] arr=new int[num]; 

		
		
		for(int i=0; i<num; i++){
			arr[i]=sc.nextInt(); 

		}
		
		int temp=0;
		for(int i=1; i<=23; i++){
			for(int j=0; j<arr.length; j++){
				 
				if(arr[j]==i){
					temp++;
				}
			}
			System.out.print(temp+" ");
			temp=0; 
		}
		
	}
}
