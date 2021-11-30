package datastructure_완전탐색_백트레킹;

import java.util.Arrays;
import java.util.Scanner;

public class P014_백준_일곱난쟁이 {

	public static void main(String[] args) {
//		 Scanner sc=new Scanner(System.in); 
		 int n=9; 
//		 int[] a=new int[n]; 
//		 int sum=0; 
//		 
//		 for(int i=0; i<n; i++){
//			 a[i]=sc.nextInt(); 
//			 sum+=a[i]; 
//		 }
//		 Arrays.sort(a);
		 int temp=0; 
		 for(int i=0; i<n; i++){
			 for(int j=i+1; j<n; j++){
				 System.out.println(i+" : "+j);
				 temp++;
//				 if(sum-a[i]-a[j] ==100){
//					 for(int k=0; k<n; k++){
//						 if(i == k || j == k) continue; 
//						 System.out.println(a[k]);
//
//					 }
//					 break;
//				 } 
			 }
		 }
		 System.out.println(temp);
		 
	
		 
		
	}

}
