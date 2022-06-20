package leetCode.Arrays;

import java.util.LinkedList;
import java.util.Queue;

//Duplicate Zeros
//https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
public class P004_¾î·Æ {
	
	 public static void duplicateZeros(int[] arr) {
		 
		 for(int i=0; i<arr.length; i++){
			 
			 
			 if(arr[i]==0){
				 
				 for(int j=arr.length-1; j>i; j--){
					 arr[j]=arr[j-1]; 
				 }
				 i++;
				 
			 }
			 
		 }
		 
		 for(int k : arr){
			 System.out.print(k+ " ");
			
		 }
		 System.out.println();
		 
		 
	 }
	 
	 public static void func001(int[] arr){
		 Queue<Integer> q=new LinkedList<>(); 
		 
		 for(int i=0; i<arr.length; i++){ 
			 if(arr[i]==0){
				 q.add(0);
				 q.add(0);
			 }else{
				 q.add(arr[i]); 
			 }
			 
			 Integer first = q.poll(); 
			 arr[i]=first; 
		 }
		 
		 for(int k : arr){
			 System.out.print(k+" ");
		
		 }
		 System.out.println();
		 
	 }
	 
	public static void main(String[] args) {
		
		int[] arr1={1,0,2,3,0,4,5,0}; 
		int[] arr2={1,0,2,3,0,4,5,0}; 
		duplicateZeros(arr1);
		func001(arr2);
	

	}
	
	//1,0,2,3,0,4,5,0
	/*
	  1,0,0,2,3,0,4,5
	  1,0,0,2,3,0,0,4
	 */

}
